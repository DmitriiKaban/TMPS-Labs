package com.app.facade;

public class Scoreboard {
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the football match!");
    }
    public void showScore(int home, int away) {
        System.out.println("Score - Home: " + home + " Away: " + away);
    }
}

