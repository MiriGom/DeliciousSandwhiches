package com.pluralsight;

public class Meat extends StoreItem implements Priceable{
    boolean extra;

    Meat(String name, double price, String size) {
        super(name, price, size);
    }

}
