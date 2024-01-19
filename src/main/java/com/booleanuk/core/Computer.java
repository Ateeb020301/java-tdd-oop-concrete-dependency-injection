package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply power;
    public Computer(PowerSupply power, ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        this.power = power;
        power.turnOn();

    }
    public Computer(PowerSupply power) {
        power.turnOn();
    }
    public Computer(Game game) {
        game.start();
    }



    public void turnOn() {
        //this.installedGames = new ArrayList<>();
        PowerSupply psu = new PowerSupply();
        psu.turnOn();
    }

    public void installGame(Game g) {
        this.installedGames.add(g);
    }

    public String playGame(String ga) {
        for (Game g : this.installedGames) {
            if (g.name.equals(ga)) {
                return g.start();
            }
        }
        return "Game not installed";
    }
    public int getNumberOfInstalledGames(){
        return this.installedGames.size();
    }
    public String getGameNameAtIndex(int index){
        return this.installedGames.get(index).getName();
    }

}
