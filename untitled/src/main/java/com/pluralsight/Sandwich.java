package com.pluralsight;

import java.util.ArrayList;

public class Sandwich extends StoreItem {
    private boolean toasted;

    public Sandwich(boolean toasted, String name, double price, String size) {
        super(name, price, size);
    }
}
