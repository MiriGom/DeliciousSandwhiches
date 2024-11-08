package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        UserPrompts uPrompts = new UserPrompts();
        boolean isRunning = true;
        while (isRunning) {
            uPrompts.userInterface();
            isRunning = false;
        }
    }

}
