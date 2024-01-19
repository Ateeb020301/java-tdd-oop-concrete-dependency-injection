package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public Computer(PowerSupply power, ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        power.turnOn();

    }
    public Computer(PowerSupply power) {
        power.turnOn();
    }



    public void turnOn() {
        //this.installedGames = new ArrayList<>();
        PowerSupply psu = new PowerSupply();
        psu.turnOn();
    }

    public void installGame(String g) {
        Game game = new Game(g);
        this.installedGames.add(game);
    }

    public String playGame(String ga) {
        for (Game g : this.installedGames) {
            if (g.name.equals(ga)) {
                return g.start();
            }
        }
        return "Game not installed";
    }

}
