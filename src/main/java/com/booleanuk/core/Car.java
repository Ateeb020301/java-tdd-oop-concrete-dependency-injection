package com.booleanuk.core;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = new Engine();
    }
    public void accelerate(){
        this.engine.ignite();
        this.engine.injection();
    }
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Car car = new Car(engine1);
        car.accelerate();
        car.accelerate();
        engine1.repair();
    }
}

