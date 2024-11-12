package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class DeliStore {
    static Scanner scan = new Scanner(System.in);
    static Sandwich s = new Sandwich("");
    static HashMap<Integer, Chip> availableChips =  new HashMap<>();
    static ArrayList <StoreItem> order = new ArrayList<>();
    static HashMap<Integer, Drink> availableDrinks = new HashMap();
  //  ArrayList <PremiumTopping> premiumToppings = new ArrayList<>();


    public DeliStore() {

        availableDrinks.put(1, new Drink("Fanta"));
        availableDrinks.put(2, new Drink("Coca Cola"));
        availableDrinks.put(3, new Drink("Sprite"));

        availableChips.put(1, new Chip("Lay's"));
        availableChips.put(2, new Chip("Doritos"));
        availableChips.put(3, new Chip("Pringles"));

    }
    // Storeitems looping through and displaying their available items lists.
    public void displayAvailableDrinks() {
        System.out.println("Drink Options");
        for (int i = 1; i <= availableDrinks.size(); i++) {
            Drink drink = availableDrinks.get(i);
            System.out.println(i + ") " + drink.getName());
        }
    }

    public void displayAvailableChips() {
        System.out.println("Chip Options");
        for (int i = 1; i <= availableChips.size(); i++) {
            Chip chip = availableChips.get(i);
            System.out.println(i + ") " + chip.getName());
        }
    }
    public void displayAvailableToppings() {

        System.out.println("Available Toppings:");
        for (Sandwich.RegularTopping topping: Sandwich.RegularTopping.values()) {
            System.out.println((topping.ordinal() + 1) + ") " + topping.name());
        }
    }
    public void displaySides() {
        for (Sandwich.Side side: Sandwich.Side.values()) {
            System.out.println((side.ordinal() + 1 + ") " + side.name()));
        }
    }
    public void displayAvailableSauces(){
        for (Sandwich.Sauce sauce : Sandwich.Sauce.values()) {
            System.out.println((sauce.ordinal() + 1) + ") " + sauce.name()) ;
        }
    }

}

