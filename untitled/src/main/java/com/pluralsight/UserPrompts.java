package com.pluralsight;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserPrompts {
    static Scanner scan = new Scanner(System.in);
    public void userInterface(){
        getHomePage();
    }
    public void getHomePage() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.printf("""
                    =====================================
                       WELCOME TO DELICIOUS SANDWHICHES
                    =====================================
                    A) START YOUR ORDER
                    B) EXIT APP
                    """);
                String uInput = scan.nextLine().trim();
                if (uInput.equalsIgnoreCase("A")) {
                } else if (uInput.equalsIgnoreCase("B")) {
                    System.out.println("See ya later, Alligator!");
                    isRunning = false;
                } else {
                    System.out.println("Invalid Input, please enter \"A\" or \"B\"");
                }
        }
    }
}
