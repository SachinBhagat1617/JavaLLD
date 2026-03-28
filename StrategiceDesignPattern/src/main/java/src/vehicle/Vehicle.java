package src.vehicle;

import src.DriveStrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy; // has-a relationship
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
