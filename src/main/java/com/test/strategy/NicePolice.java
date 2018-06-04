package com.test.strategy;

public class NicePolice implements Strategy{
    @Override
    public void processSpeed(int speed) {
        System.out.println("This is your first time, be sure don't do it again.");
    }
}
