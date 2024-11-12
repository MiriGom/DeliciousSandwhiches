package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PointOfSales {
    //static List<Object> orderList = new ArrayList<>();
    static List<Priceable> orderList = new ArrayList<>();



    public void addItemToOrder(Priceable item){
        orderList.add(item);
        System.out.println(item.toString() + " Successfully added to your order");
    }
    public void displayOrder() {
        double totalCost = 0;
        //object obl
        for (Priceable item : orderList)  {
            totalCost += item.getPrice();
            System.out.println(item);
        }
        System.out.println(String.format("total cost: $%.2f", totalCost));

    }
}
