package com.booleanuk.core;

public class Game {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game(String name) {

        this.name = name;
    }

    public String start() {

        return "Playing " + this.name;
    }
}
