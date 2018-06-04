package com.test.strategy;

public class HardPolice implements Strategy {
    @Override
    public void processSpeed(int speed) {
        System.out.println("Your speed is " + speed + ", and should get a ticket.");
    }
}
