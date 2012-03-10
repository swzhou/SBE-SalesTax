package com.thoughtworks.salestax;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-9
 * Time: 下午10:19
 * To change this template use File | Settings | File Templates.
 */
public class Product {
    private String name;
    private int count;
    private String isImport;
    private BigDecimal rawPrice;
    private static final BasicTax basicTax = new BasicTax();
    private static final ImportDuty importDuty = new ImportDuty();
    private static final ITaxCategory[] taxCategories = new ITaxCategory[]{
            new BasicTax(),
            new ImportDuty()
    };

    public Product(String name, int count, String isImport, BigDecimal rawPrice) {
        this.name = name;
        this.count = count;
        this.isImport = isImport;
        this.rawPrice = rawPrice;
    }

    public boolean isApplyTo() {
        return getImport().equalsIgnoreCase("No");
    }

    public String getImport() {
        return isImport;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getRawPrice() {
        return rawPrice;
    }

    public BigDecimal getBasicTax() {
        return basicTax.calculate(this);
    }

    public BigDecimal getImportDuty() {
        return importDuty.calculate(this);
    }

    public BigDecimal getTax() {
        BigDecimal amount = BigDecimal.valueOf(0.00);
        for (ITaxCategory taxCategory : taxCategories) {
            amount = amount.add(taxCategory.calculate(this));
        }
        return amount;
    }

    public BigDecimal getTotalPrice() {
        return getRawPrice().add(getTax());
    }
}
