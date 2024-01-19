package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ComputerTest {
    @Test
    public void shouldTurnOn() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        myPc.turnOn();
        Assertions.assertTrue(myPsu.isOn);
    }

    @Test
    public void shouldInstallGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

        Game game = new Game("Final Fantasy XI");
        myPc.installGame(game);

        Assertions.assertEquals(1, myPc.getNumberOfInstalledGames());
        Assertions.assertEquals("Final Fantasy XI", myPc.getGameNameAtIndex(0));
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

       Game game1 = new Game("Duck game");
       Game game2 = new Game("Dragon's Dogma: Dark Arisen");
       myPc.installGame(game1);
       myPc.installGame(game2);

        Assertions.assertEquals("Playing Duck Game", myPc.playGame("Duck Game"));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame("Dragon's Dogma: Dark Arisen"));
        Assertions.assertEquals("Game not installed", myPc.playGame("Morrowind"));
    }

    @Test
    public void canPreinstallGames() {
        PowerSupply myPsu = new PowerSupply();
        Game game1 = new Game("Duck game");
        Game game2 = new Game("Dragon's Dogma: Dark Arisen");


        Computer myPc = new Computer(myPsu, (ArrayList<Game>) Arrays.asList(game1,game2));

        Assertions.assertEquals(2, myPc.getNumberOfInstalledGames());
        Assertions.assertEquals("Dwarf Fortress", myPc.getGameNameAtIndex(0));
        Assertions.assertEquals("Baldur's Gate", myPc.getGameNameAtIndex(1));
    }
}