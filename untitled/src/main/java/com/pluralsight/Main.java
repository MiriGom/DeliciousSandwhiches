package com.pluralsight;

public class Main {
    //1. created program to run the application
    public static void main(String[] args) {
        UserPrompts uPrompts = new UserPrompts();
        boolean isRunning = true;
        while (isRunning) {
            uPrompts.userInterface();
            isRunning = false;
        }
    }

}
