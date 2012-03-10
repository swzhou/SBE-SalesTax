package com.thoughtworks.salestax.spec;

import com.thoughtworks.salestax.Product;
import org.concordion.integration.junit3.ConcordionTestCase;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-9
 * Time: 下午10:17
 * To change this template use File | Settings | File Templates.
 */
public class SalesTaxTest extends ConcordionTestCase{

    public Product buildProduct(String name, int count, String isImport, double rawPrice) {
           return new Product(name, count, isImport, BigDecimal.valueOf(rawPrice));
    }
}
