package com.pluralsight;

import java.util.ArrayList;

public class DeliStore {
    ArrayList <Chip> availableChips =  new ArrayList<>();
    ArrayList <Drink> availableDrinks = new ArrayList<>();


    public DeliStore() {
        availableDrinks = new ArrayList<>();
        availableChips = new ArrayList<>();

        availableDrinks.add(new Drink("Fanta"));
        availableDrinks.add(new Drink("Coca Cola"));
        availableDrinks.add(new Drink("Sprite"));

        availableChips.add(new Chip("Lay's"));
        availableChips.add(new Chip("Doritos"));
        availableChips.add(new Chip("Pringles"));

    }

    public void displayAvailableDrinks() {
        System.out.println("Drink Options");
        for (int i = 0; i < availableDrinks.size(); i++)
            System.out.println((i + 1) + ") " + availableDrinks.get(i));
        }

    public void displayAvailableChips() {
        System.out.println("Chip Options");
        for (int i = 0; i < availableChips.size(); i++) {
            System.out.println((i + 1) + ") " + availableChips.get(i));
        }
    }
}

