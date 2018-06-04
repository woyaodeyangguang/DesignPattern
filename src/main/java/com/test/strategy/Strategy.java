package com.test.strategy;

/**
 * 策略模式
 * https://www.programcreek.com/2011/01/a-java-example-of-strategy-design-pattern/
 */
public interface Strategy {

    // define a method for police to process speeding case.
    void processSpeed(int speed);
}
