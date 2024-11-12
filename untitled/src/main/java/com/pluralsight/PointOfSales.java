package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PointOfSales {



    public void addItemToOrder(Object o){
        List<Object> orderList = new ArrayList<>();
        orderList.add(o);
       for (Object obj : orderList) {
           System.out.println(obj.toString() + " Successfully added to your order");
       }
    }
}
