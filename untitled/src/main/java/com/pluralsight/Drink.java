package com.pluralsight;

public class Drink extends StoreItem{


  public Drink(String name){
      super(name);
  }

  public Drink(String name, String size, double price) {
      super(name, price, size);
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
