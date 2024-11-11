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
    ArrayList <Drink> availableDrinks = new ArrayList<>();
  //  ArrayList <PremiumTopping> premiumToppings = new ArrayList<>();


    public DeliStore() {
        availableDrinks = new ArrayList<>();
       // HashMap <Integer, Chip> availableChips = new HashMap<>();

        availableDrinks.add(new Drink("Fanta"));
        availableDrinks.add(new Drink("Coca Cola"));
        availableDrinks.add(new Drink("Sprite"));

        availableChips.put(1, new Chip("Lay's"));
        availableChips.put(2, new Chip("Doritos"));
        availableChips.put(3, new Chip("Pringles"));

    }
    // Storeitems looping through and displaying their available items lists.
    public void displayAvailableDrinks() {
        System.out.println("Drink Options");
        for (int i = 0; i < availableDrinks.size(); i++)
            System.out.println((i + 1) + ") " + availableDrinks.get(i));
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
    public void selectItem(int chipIndex) {
        if (availableChips.containsKey(chipIndex)) {
            Chip chipSelected = availableChips.get(chipIndex);
            System.out.println("add " + chipSelected.getName() + " chips to your order?");
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {

            } else return;
        }
    }

}

