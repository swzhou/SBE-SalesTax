package com.thoughtworks.salestax;

/**
 * Created by IntelliJ IDEA.
 * User: MacX
 * Date: 12-3-10
 * Time: 下午9:28
 * To change this template use File | Settings | File Templates.
 */
public class TypeDictionary {
    public static boolean isMedicalProduct(String name) {
        return getType(name).equalsIgnoreCase("medical products");
    }

    public static boolean isFood(String name) {
        return getType(name).equalsIgnoreCase("food");
    }

    public static boolean isBook(String name) {
        return getType(name).equalsIgnoreCase("book");
    }

    private static String getType(String name) {
        if(name.equalsIgnoreCase("book")) {
            return "book";
        }
        if(name.contains("chocolate")) {
            return "food";
        }
        if(name.equalsIgnoreCase("packet of headache pills")) {
            return "medical products";
        }
        return "";
    }
}
