package com.app.facade;

public class FootballGameFacade {
    private Stadium stadium;
    private Scoreboard scoreboard;
    private LightingSystem lightingSystem;

    public FootballGameFacade(Stadium stadium, Scoreboard scoreboard, LightingSystem lightingSystem) {
        this.stadium = stadium;
        this.scoreboard = scoreboard;
        this.lightingSystem = lightingSystem;
    }

    public void startMatch() {
        System.out.println("Preparing to start the match...");
        stadium.openGates();
        lightingSystem.turnOn();
        scoreboard.displayWelcomeMessage();
    }

    public void endMatch() {
        System.out.println("Ending the match...");
        lightingSystem.turnOff();
        scoreboard.showScore(2, 1); // Example score
        stadium.closeGates();
    }
}

