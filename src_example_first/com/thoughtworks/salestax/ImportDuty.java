package com.thoughtworks.salestax;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-10
 * Time: 下午10:24
 * To change this template use File | Settings | File Templates.
 */
public class ImportDuty implements ITaxCategory {

    private final double rate = 0.05;

    public BigDecimal calculate(Product product) {
        return product.isApplyTo()
                ? BigDecimal.valueOf(0.00) : RoundingRule.roundUp(getTax(product));
    }

    private BigDecimal getTax(Product product) {
        return product.getRawPrice().multiply(BigDecimal.valueOf(rate));
    }

}
