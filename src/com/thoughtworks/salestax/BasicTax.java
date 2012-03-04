package com.thoughtworks.salestax;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: swzhou
 * Date: 12-3-4
 * Time: 下午10:13
 * To change this template use File | Settings | File Templates.
 */
public class BasicTax {

    private final double rate = 0.1;
    private final ArrayList<String> types = new ArrayList<String>();

    public double getRate() {
        return rate;
    }

    public ArrayList<String> getExemptProductTypes() {
        if (types.size() == 0) {
            types.add("Book");
            types.add("Food");
            types.add("Medical Product");
        }
        return types;
    }

    public double apply(String type, double price) {
        return getExemptProductTypes().contains(type) ?
                0 : price * getRate();
    }
}
