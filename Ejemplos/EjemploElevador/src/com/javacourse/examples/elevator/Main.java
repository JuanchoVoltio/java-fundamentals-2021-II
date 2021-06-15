package com.javacourse.examples.elevator;

public class Main {

    public static void main(String[] args) {
    	/* Ejemplo para un elevador simple */
//	    Elevator myElevator = new Elevator();
//	    myElevator.currentLevel = 48;
//	    System.out.println(myElevator.MAX_LEVEL);
//
//	    myElevator.openDoor();
//	    myElevator.closeDoor();
//	    myElevator.goUp();
//		myElevator.goUp();
//		myElevator.goUp();
//        myElevator.openDoor();


		Building myBuilding = new Building();
		myBuilding.name = "Torre Colpatria";

		//Gregory va a subir usando el primer ascensor
		myBuilding.elevators[0].openDoor();
		myBuilding.elevators[0].closeDoor();
		myBuilding.elevators[0].goUp();
		myBuilding.elevators[0].openDoor();

		System.out.println("-------------------");

		//Gabriel va a bajar usando el tercer ascensor
		myBuilding.elevators[2].currentLevel = 48;
		myBuilding.elevators[2].openDoor();
		myBuilding.elevators[2].closeDoor();
		myBuilding.elevators[2].goDown();
		myBuilding.elevators[2].goDown();
		myBuilding.elevators[2].openDoor();

		System.out.println("======================");
		System.out.println("Elevator 1 is in level " + myBuilding.elevators[0].currentLevel);
		System.out.println("Elevator 2 is in level " + myBuilding.elevators[1].currentLevel);
		System.out.println("Elevator 3 is in level " + myBuilding.elevators[2].currentLevel);
    }
}
