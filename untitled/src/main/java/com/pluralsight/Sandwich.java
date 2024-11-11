package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich extends StoreItem {
    private boolean toasted;
    ArrayList <RegularTopping> regularToppings = new ArrayList<>();
    ArrayList <Sauce> sauces = new ArrayList<>();
    ArrayList <Side> sides = new ArrayList<>();

    public Sandwich(String name) {
        super(name);
    }
    public Sandwich(boolean toasted, String name, double price, String size) {
        super(name, price, size);
        this.toasted = toasted;

    }
    public enum Sauce {
        MAYO,
        KETCHUP,
        RANCH,
        THOUSAND_ISLANDS,
        VINAIGRETTE
    }
    public enum Side {
        AU_JUS,
        SIDE_SALAD

        }
    public enum RegularTopping {
        LETTUCE,
        PEPPERS,
        ONIONS,
        TOMATOES,
        JALEPENOS,
        CUCUMBERS,
        PICKLES,
        GUACAMOLE,
        MUSHROOMS
    }
}
