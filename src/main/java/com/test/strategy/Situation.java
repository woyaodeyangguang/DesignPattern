package com.test.strategy;

/**
 * 策略模式
 * Strategy Pattern in JDK
 * 1). Java.util.Collections#sort(List list, Comparator < ? super T > c)
 * 2). java.util.Arrays#sort(T[], Comparator < ? super T > c)
 */
public class Situation {
    private Strategy strategy;

    public Situation(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handleByPolice(int speed) {
        this.strategy.processSpeed(speed);
    }

    public static void main(String[] args) {
        HardPolice hardPolice = new HardPolice();
        NicePolice nicePolice = new NicePolice();

        Situation situation1 = new Situation(hardPolice);
        Situation situation2 = new Situation(nicePolice);
        situation1.handleByPolice(10);
        situation2.handleByPolice(10);
    }
}
