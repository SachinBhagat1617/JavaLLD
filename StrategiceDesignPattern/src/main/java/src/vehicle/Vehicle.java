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

//🧠 What you improved
//public interface Vehicle {
//    void drive();
//}

//public class OffRoadVehicle implements Vehicle {
//    private DriveStrategy strategy; //code duplication
//
//    public OffRoadVehicle(DriveStrategy strategy) {
//        this.strategy = strategy;
//    }
//
//    public void drive() {
//        strategy.drive();
//    }
//}
//
//✔ Strategy is injected (Dependency Injection)
//✔ No hardcoding
//✔ Behavior is swappable
//
//👉 This is now valid Strategy usage
//
//⚠️ But there is still a design smell
//
//Look at this:
//
//class OffRoadVehicle implements Vehicle
//class SportsVehicle implements Vehicle
//class PassengerVehicle implements Vehicle
//
//Each class will have:
//
//private DriveStrategy strategy;
//
//constructor...
//
//drive() {
//    strategy.drive();
//}
//🚨 Problem: Code Duplication
//
//You are repeating:
//
//field
//constructor
//delegation logic
//
//in every vehicle class