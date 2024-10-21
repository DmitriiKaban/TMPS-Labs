package com.app;

import com.app.adapter.*;
import com.app.composite.CompositeGame;
import com.app.composite.Game;
import com.app.composite.SimpleGame;
import com.app.facade.FootballGameFacade;
import com.app.facade.LightingSystem;
import com.app.facade.Scoreboard;
import com.app.facade.Stadium;

public class App {
    public static void main(String[] args) {

        adapterPatternDemo();
        facadePatternDemo();
        compositePatternDemo();
    }

    public static void adapterPatternDemo() {
        Person chinesePerson = new ChinesePerson();
        Person germanPerson = new GermanPerson();

        TranslatorAdapter chineseAdapter = new TranslatorAdapter(chinesePerson);
        TranslatorAdapter germanAdapter = new TranslatorAdapter(germanPerson);

        chineseAdapter.communicate();
        germanAdapter.communicate();

        SolarPerson solarPerson = new SolarPerson();
        Person solarAdapter = new TranslatorFromUnknownLanguages(solarPerson);
        solarAdapter.speak();
    }

    public static void facadePatternDemo() {
        Stadium stadium = new Stadium();
        Scoreboard scoreboard = new Scoreboard();
        LightingSystem lightingSystem = new LightingSystem();

        FootballGameFacade footballGame = new FootballGameFacade(stadium, scoreboard, lightingSystem);

        footballGame.startMatch();
    }

    public static void compositePatternDemo() {

        Game game1 = new SimpleGame("basketball");
        Game game2 = new SimpleGame("football");
        Game game3 = new SimpleGame("volleyball");

        CompositeGame gta = new CompositeGame("GTA");
        gta.addGame(game1);
        gta.addGame(game2);
        gta.addGame(game3);

        CompositeGame cyberSport = new CompositeGame("CyberSport");
        cyberSport.addGame(gta);
        cyberSport.addGame(new SimpleGame("CS:GO"));
        cyberSport.addGame(new SimpleGame("Dota 2"));

        cyberSport.play();
    }
}

