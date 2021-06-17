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


		Building myBuilding = new Building(50, 1);
		myBuilding.name = "Torre Colpatria";
		Building anotherBuilding = new Building(36, 0);
		anotherBuilding.name = "Edificio Tequendama";

		anotherBuilding.elevators[0].goUp(anotherBuilding.MAX_LEVEL);

		//Gregory va a subir usando el primer ascensor
		myBuilding.elevators[0].openDoor();
		myBuilding.elevators[0].closeDoor();
		myBuilding.elevators[0].goUp(myBuilding.MAX_LEVEL);
		myBuilding.elevators[0].openDoor();

		System.out.println("-------------------");

		//Gabriel va a bajar usando el tercer ascensor
		myBuilding.elevators[2].currentLevel = 48;
		myBuilding.elevators[2].openDoor();
		myBuilding.elevators[2].closeDoor();
		myBuilding.elevators[3].goTo(46);
//		myBuilding.elevators[2].goDown(myBuilding.MIN_LEVEL);
//		myBuilding.elevators[2].goDown(myBuilding.MIN_LEVEL);
		myBuilding.elevators[2].openDoor();

		System.out.println("======================");
		System.out.println("Elevator 1 is in level " + myBuilding.elevators[0].currentLevel);
		System.out.println("Elevator 2 is in level " + myBuilding.elevators[1].currentLevel);
		System.out.println("Elevator 3 is in level " + myBuilding.elevators[2].currentLevel);
    }
}
