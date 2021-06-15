package com.javacourse.examples.elevator;

public class Elevator {
    public final int MAX_LEVEL = 50;
    public int min_level = 1; //TODO: Volver constante este atributo
    public int currentLevel;
    public boolean doorOpen;

    public void goUp(){
        System.out.println("Going up....");
        if(!doorOpen){
            if(currentLevel < MAX_LEVEL) {
                this.currentLevel++;
            }else{
                System.out.println("[WARNING] - You're already in the highest level!");
            }
        }else{
            System.out.println("[WARNING] - The door is Open!");
        }
        System.out.println("You're now in level " + currentLevel);
    }

    public void goDown(){
        System.out.println("Going down....");
        if(!doorOpen){
            if(currentLevel > min_level) {
                this.currentLevel--;
            }else{
                System.out.println("[WARNING] - You're already in the lowest level!");
            }
        }else{
            System.out.println("[WARNING] - The door is Open!");
        }
        System.out.println("You're now in level " + currentLevel);
    }

    public void openDoor(){
        System.out.println("Opening the door....");
        this.doorOpen = true;
        System.out.println("Now the door is open");
    }

    public void closeDoor(){
        System.out.println("Closing the door....");
        this.doorOpen = false;
        System.out.println("Now the door is closed");
    }

}
