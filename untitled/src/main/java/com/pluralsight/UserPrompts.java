package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
                customizeSandwich();
                break;
            } else if (uInput.equalsIgnoreCase("B")) {
                deliStore.displayAvailableDrinks();
                addDrink();
                break;
            } else if (uInput.equalsIgnoreCase("C")) {
                //addChips()
            }
        }
    }

    public void customizeSandwich() {
        System.out.println("What size sandwich would you like?");
        String userSizeInput = scan.nextLine();

    }
    public void addDrink(){

    }
}
