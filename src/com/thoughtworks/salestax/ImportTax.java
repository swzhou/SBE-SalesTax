package com.thoughtworks.salestax;

/**
 * Created by IntelliJ IDEA.
 * User: swzhou
 * Date: 12-3-5
 * Time: 下午10:22
 * To change this template use File | Settings | File Templates.
 */
public class ImportTax {
    public double getRate() {
        return 0.05;
    }

    public double apply(boolean isImport, double price) {
        return isImport ? price * getRate() : 0;
    }
}
