package com.pluralsight;

public class Chip extends StoreItem {


    public Chip(String name) {
        super(name);
    }

    public Chip(String name, double price) {
        super(name, price);
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

    @Override
    public String toString() {
        return "Chip{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
