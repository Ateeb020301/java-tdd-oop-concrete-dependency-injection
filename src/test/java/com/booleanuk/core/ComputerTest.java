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
        Assertions.assertTrue(myPsu.isOn());
    }

    @Test
    public void shouldInstallGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

        Game ffXi = new Game("Final Fantasy XI");
        myPc.installGame(ffXi);

        Assertions.assertEquals(1, myPc.getNumberOfInstalledGames());
        Assertions.assertEquals("Final Fantasy XI", myPc.getGameNameAtIndex(0));
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

        Game duckGame = new Game("Duck Game");
        Game dragonsDogma = new Game("Dragon's Dogma: Dark Arisen");
        myPc.installGame(duckGame);
        myPc.installGame(dragonsDogma);

        Assertions.assertEquals("Playing Duck Game", myPc.playGame("Duck Game"));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame("Dragon's Dogma: Dark Arisen"));
        Assertions.assertEquals("Game not installed", myPc.playGame("Morrowind"));
    }

    @Test
    public void canPreinstallGames() {
        PowerSupply myPsu = new PowerSupply();
        ArrayList<Game> preInstalled = new ArrayList<>(Arrays.asList(
                new Game("Dwarf Fortress"),
                new Game("Baldur's Gate")
        ));

        Computer myPc = new Computer(myPsu, preInstalled);

        Assertions.assertEquals(2, myPc.getNumberOfInstalledGames());
        Assertions.assertEquals("Dwarf Fortress", myPc.getGameNameAtIndex(0));
        Assertions.assertEquals("Baldur's Gate", myPc.getGameNameAtIndex(1));
    }

}
