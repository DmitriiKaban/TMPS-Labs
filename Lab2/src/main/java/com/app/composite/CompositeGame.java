package com.app.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGame implements Game {
    private String name;
    private List<Game> games;

    public CompositeGame(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing " + name + ", it also includes:");
        if (games != null) {
            for (Game game : games) {
                game.play();
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void addGame(Game game) {
        if (games == null) {
            games = new ArrayList<>();
        }
        games.add(game);
    }

    public void removeGame(Game game) {
        if (games != null) {
            games.remove(game);
        }
    }
}
