package com.pluralsight;

import java.util.ArrayList;

public class Drink {
  private String name;
  private String size;
  private double price;

  public Drink(String name){
      this.name = name;
  }

  public Drink(String name, String size, double price) {
      this.name = name;
      this.size = size;
      this.price = price;
  }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
