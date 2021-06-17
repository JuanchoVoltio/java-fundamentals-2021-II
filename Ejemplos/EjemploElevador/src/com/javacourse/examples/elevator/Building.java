package com.javacourse.examples.elevator;

public class Building {
    public final int MAX_LEVEL;
    public final int MIN_LEVEL;
    public String name;
    public Elevator[] elevators = { new Elevator(1), new Elevator(30), new Elevator(48)} ;

    public Building(int maxLevel, int minLevel){
        this.MAX_LEVEL = maxLevel;
        this.MIN_LEVEL = minLevel;
    }
}
