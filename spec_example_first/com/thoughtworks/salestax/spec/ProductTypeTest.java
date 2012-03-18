package com.thoughtworks.salestax.spec;

import com.thoughtworks.salestax.TypeDictionary;
import org.concordion.integration.junit3.ConcordionTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/18/12
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductTypeTest extends ConcordionTestCase{

    public boolean isBook(String name) {
        return TypeDictionary.isBook(name);
    }

    public boolean isFood(String name) {
        return TypeDictionary.isFood(name);
    }

    public boolean isMedicalProduct(String name) {
        return TypeDictionary.isMedicalProduct(name);
    }
}
