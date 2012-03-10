package com.thoughtworks.salestax;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-10
 * Time: 下午9:13
 * To change this template use File | Settings | File Templates.
 */
public class BasicTax implements ITaxCategory {

    private static final double rate = 0.1;

    public BigDecimal calculate(Product product) {
        return isApplyTo(product)
                ? BigDecimal.valueOf(0.00) : getTax(product);
    }

    private boolean isApplyTo(Product product) {
        String name = product.getName();
        return TypeDictionary.isBook(name) ||
                TypeDictionary.isFood(name) ||
                TypeDictionary.isMedicalProduct(name);
    }

    private BigDecimal getTax(Product product) {
        BigDecimal rawTax = getRawTax(product);
        return RoundingRule.roundUp(rawTax);
    }

    private BigDecimal getRawTax(Product product) {
        return product.getRawPrice().multiply(BigDecimal.valueOf(rate));
    }
}
