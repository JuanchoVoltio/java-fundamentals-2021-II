
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
//          myElevator.goUp();
//          myElevator.goUp();
//          myElevator.openDoor();


		Building myBuilding = new Building();
		myBuilding.name = "Torre Colpatria";

		//Gregory va a subir usando el Elevador 1
		myBuilding.elevators[0].currentLevel = 50;
                myBuilding.elevators[0].openDoor();
		myBuilding.elevators[0].closeDoor();
		myBuilding.elevators[0].goUp();
		myBuilding.elevators[0].openDoor();

		System.out.println("-------------------");

		//Henry va a bajar usando el Elevador 2
		myBuilding.elevators[1].currentLevel = 1;
		myBuilding.elevators[1].openDoor();
		myBuilding.elevators[1].closeDoor();
		myBuilding.elevators[1].goDown();
		//myBuilding.elevators[1].goDown();
		myBuilding.elevators[1].openDoor();
                
                System.out.println("-------------------");

		//Gabriel va a bajar usando el Elevador 3
		myBuilding.elevators[2].currentLevel = 5;
		myBuilding.elevators[2].openDoor();
		myBuilding.elevators[2].closeDoor();
		myBuilding.elevators[2].goDown();
		//myBuilding.elevators[2].goDown();
		myBuilding.elevators[2].openDoor();
                
                System.out.println("======================");
		System.out.println("Elevator 1 of the " + myBuilding.name + " is in level " + myBuilding.elevators[0].currentLevel);
		System.out.println("Elevator 2 of the " + myBuilding.name + " is in level " + myBuilding.elevators[1].currentLevel);
		System.out.println("Elevator 3 of the " + myBuilding.name + " is in level " + myBuilding.elevators[2].currentLevel);
    }
}
