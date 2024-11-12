package com.pluralsight;

public class Drink extends StoreItem implements Priceable{


  public Drink(String name){
      super(name);
  }
  public Drink (String name, String size) {
      super(name, size);
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

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString2() {
        return String.format("%s", name);
    }
    public void setPriceBasedOnSize(String size) {
        switch (size.toLowerCase()) {
             case "small":
                this.price = 2.00;
                 break;
             case "medium":
                  this.price = 2.50;
                break;
              case "large":
                  this.price = 3.00;
                  break;
            }

    }
    public void setSize(String size) {
      this.size = size;
      setPriceBasedOnSize(size);
    }
    @Override
    public String toString() {
      return String.format("%s %s $%.2f", size, name, price);
    }
}
