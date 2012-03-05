package com.thoughtworks.salestax.spec.importtax;

import com.thoughtworks.salestax.ImportTax;
import org.concordion.integration.junit3.ConcordionTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: swzhou
 * Date: 12-3-5
 * Time: 下午10:21
 * To change this template use File | Settings | File Templates.
 */
public class ImportTaxTest extends ConcordionTestCase {

    public double getRate() {
        ImportTax importTax = givenImportTax();
        return importTax.getRate();
    }

    public double getTax(boolean isImport, double price) {
        ImportTax importTax = givenImportTax();
        return importTax.apply(isImport,price);
    }

    private ImportTax givenImportTax() {
        return new ImportTax();
    }
}
