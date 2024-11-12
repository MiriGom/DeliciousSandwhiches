package com.pluralsight;

import java.util.Scanner;



//2. terminal displays homepage
public class UserPrompts {
    static Scanner scan = new Scanner(System.in);
    public void userInterface(){
        getHomePage();
    }

    public void getHomePage() {
        DeliStore DeliStore = new DeliStore();
        boolean isRunning = true;
        while (isRunning) {
            System.out.printf("""
                    =====================================
                       WELCOME TO DELICIOUS SANDWICHES
                    =====================================
                    A) START YOUR ORDER
                    B) EXIT APP
                    """);
                String uInput = scan.nextLine().trim();
                if (uInput.equalsIgnoreCase("A")) {

                    orderPrompt(DeliStore);
                } else if (uInput.equalsIgnoreCase("B")) {
                    System.out.println("See ya later, Alligator!");
                    isRunning = false;
                } else {
                    System.out.println("Invalid Input, please enter \"A\" or \"B\"");
                }
        }
    }
    public void orderPrompt(DeliStore deliStore) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                    ===============================
                        START YOUR ORDER
                    ===============================
                    A) CUSTOMIZE A SANDWICH
                    B) ADD A DRINK
                    C) ADD A BAG OF CHIPS
                    """);
            String uInput = scan.nextLine().toUpperCase().trim();
            if (uInput.equalsIgnoreCase("A")) {
                customizeSandwich(deliStore);
                break;
            } else if (uInput.equalsIgnoreCase("B")) {
                Drink drink = new Drink("", "");
                deliStore.displayAvailableDrinks();
                int userNumberInput = scan.nextInt();
                scan.nextLine();
                System.out.println("What size drink? small, medium or large?");
                String userInputSize = scan.nextLine().trim();

                if (DeliStore.availableDrinks.containsKey(userNumberInput)) {
                    Drink selectedDrink = DeliStore.availableDrinks.get(userNumberInput);
                    selectedDrink.setSize(userInputSize);
                    confirmAdd(selectedDrink);
                }
                break;
            } else if (uInput.equalsIgnoreCase("C")) {
                System.out.println("Select a bag of Chips");
                deliStore.displayAvailableChips();
                int userSelect = scan.nextInt();
                scan.nextLine();
                if (DeliStore.availableChips.containsKey(userSelect)) {
                    Chip selectedChip = DeliStore.availableChips.get(userSelect);
                    confirmAdd(selectedChip);
                }
            }
        }
    }
    public void confirmAdd(Object o) {
        PointOfSales pos = new PointOfSales();

        System.out.println("would you like to add " + o + " to your order?");
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            pos.addItemToOrder(o);

        }

    }

    public void customizeSandwich(DeliStore deliStore) {
        System.out.println("What size sandwich would you like?");
        String userSizeInput = scan.nextLine();

        System.out.println("Please select your included toppings using commas to separate your choices");
        deliStore.displayAvailableToppings();
        String userToppingSelections = scan.nextLine();

        System.out.println("Please select a side");
        deliStore.displaySides();
        int userSide = scan.nextInt();
        scan.nextLine();

        System.out.println("please select your included sauces using commas without spaces");
        deliStore.displayAvailableSauces();

    }

}
