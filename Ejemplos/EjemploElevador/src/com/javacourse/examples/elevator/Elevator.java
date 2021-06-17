package com.javacourse.examples.elevator;

public class Elevator {

    public int currentLevel;
    public boolean doorOpen;

    public Elevator(int currentLevel){
        this.currentLevel = currentLevel;
        this.doorOpen = doorOpen;
    }

    public void goUp(int maxLevel){
        System.out.println("Going up....");
        if(!doorOpen){
            if(currentLevel < maxLevel) {
                this.currentLevel++;
            }else{
                System.out.println("[WARNING] - You're already in the highest level!");
            }
        }else{
            System.out.println("[WARNING] - The door is Open!");
        }
        System.out.println("You're now in level " + currentLevel);
    }

    public void goDown(int minLevel){
        System.out.println("Going down....");
        if(!doorOpen){
            if(currentLevel > minLevel) {
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

    public void goTo(int level){
        //TODO: Implementar este método. Pistas: Usar ciclos
    }

}
