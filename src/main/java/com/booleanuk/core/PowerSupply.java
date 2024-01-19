package com.booleanuk.core;

public class PowerSupply {
    public boolean isOn = false;

    public void turnOn() {

        this.isOn = true;
    }
    public void turnOff() {

        this.isOn = false;
    }

    public boolean isOn() {
        this.isOn = true;
        return true;
    }
}
