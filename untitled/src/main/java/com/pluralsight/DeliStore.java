package com.pluralsight;

import java.util.ArrayList;

public class DeliStore {

    ArrayList <Drink> availableDrinks = new ArrayList<>();


    public DeliStore() {
        availableDrinks = new ArrayList<>();

        availableDrinks.add(new Drink("Fanta"));
        availableDrinks.add(new Drink("Coca Cola"));
        availableDrinks.add(new Drink("Sprite"));

    }
    public void displayAvailableDrinks() {
        System.out.println("Drink Options");
        for (Drink d: availableDrinks)
            System.out.println(d.toString());
        }
    }

