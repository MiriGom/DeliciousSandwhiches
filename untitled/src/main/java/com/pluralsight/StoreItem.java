package com.pluralsight;

import java.awt.*;

public abstract class StoreItem {
   protected String name;
   protected double price;
   protected String size;

   public StoreItem(String name) {
       this.name = name;
   }
   public StoreItem(String name, String size) {
       this.name = name;
       this.size = size;

   }
   public StoreItem(String name, double price) {
       this.name = name;
       this.price = price;
   }

    public StoreItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
