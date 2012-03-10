package com.thoughtworks.salestax;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-10
 * Time: 下午10:34
 * To change this template use File | Settings | File Templates.
 */
public interface ITaxCategory {
    public BigDecimal calculate(Product product);
}
