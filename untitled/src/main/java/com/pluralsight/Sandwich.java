package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich extends StoreItem {
    private boolean toasted;
    private ArrayList <RegularTopping> regularToppings = new ArrayList<>();
    private ArrayList <Sauce> sauces = new ArrayList<>();
    private ArrayList <Side> sides = new ArrayList<>();

    public Sandwich(String name) {
        super(name);
    }
    public Sandwich(boolean toasted, String name, double price, String size) {
        super(name, price, size);
        this.toasted = toasted;
        setPriceBasedOnSize(size);

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
    public void setPriceBasedOnSize(String size) {
        switch (size.toLowerCase()) {
            case "small":
                this.price = 5.50;
                break;
            case "medium":
                this.price = 7.00;
                break;
            case "large":
                this.price = 8.50;
                break;
        }
    }
    public void setSize(String size) {
        this.size = size;
        setPriceBasedOnSize(size);
    }

}
