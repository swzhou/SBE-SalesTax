package com.thoughtworks.salestax.spec.basictax;

import com.thoughtworks.salestax.BasicTax;
import org.concordion.integration.junit3.ConcordionTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: swzhou
 * Date: 12-3-4
 * Time: 下午9:45
 * To change this template use File | Settings | File Templates.
 */
public class BasicTaxTest extends ConcordionTestCase {

    public double getRate() {
        BasicTax basicTax = givenBasicTax();
        return basicTax.getRate();
    }

    public Iterable<String> getExemptProductTypes() {
        BasicTax basicTax = givenBasicTax();
        return basicTax.getExemptProductTypes();
    }

    public double getTax(String type, double price) {
        BasicTax basicTax = givenBasicTax();
        return basicTax.apply(type, price);
    }

    private BasicTax givenBasicTax() {
        return new BasicTax();
    }
}
