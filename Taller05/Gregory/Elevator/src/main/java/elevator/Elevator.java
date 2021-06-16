
public class Elevator {
    
    public int currentLevel;
    public boolean doorOpen;

    public void goUp(){
        System.out.println("Going up....");
        if(!doorOpen){
            //se invoca la variable MAX_LEVEL de la clase Building using Building.MAX_LEVEL
            if(currentLevel < Building.MAX_LEVEL) {
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
            //se invoca la variable MIN_LEVEL de la clase Building using Building.MIN_LEVEL
            if(currentLevel > Building.MIN_LEVEL) {
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
        System.out.println("You're in level " + currentLevel);//message para informar al usuario en que nivel esta
    }

    public void closeDoor(){
        System.out.println("Closing the door....");
        this.doorOpen = false;
        System.out.println("Now the door is closed");
        
    }
}