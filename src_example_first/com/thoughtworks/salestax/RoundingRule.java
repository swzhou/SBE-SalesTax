package com.thoughtworks.salestax;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-10
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 */
public class RoundingRule {

    private static final double unitAmount = 0.05;

    public static BigDecimal roundUp(BigDecimal rawTax) {
        int ceil = (int) Math.ceil(rawTax.doubleValue() / unitAmount);
        return BigDecimal.valueOf(ceil).multiply(BigDecimal.valueOf(unitAmount));
    }
}
