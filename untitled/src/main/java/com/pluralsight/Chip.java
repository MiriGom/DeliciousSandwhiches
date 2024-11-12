package com.pluralsight;

public class Chip extends StoreItem implements Priceable{


    public Chip(String name) {
        super(name);
        this.price = 1.50;
    }

    public Chip(String name, double price) {
        super(name);

    }
    public Chip(String name, double price, String size) {
        super(name, price, size);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(){
        this.price = 1.50;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f", name, price);
    }
}
