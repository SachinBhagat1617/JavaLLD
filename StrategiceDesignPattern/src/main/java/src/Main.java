package src;

import src.DriveStrategy.SportDrive;
import src.vehicle.OffRoadVehicle;
import src.vehicle.Vehicle;
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle(new SportDrive());
        vehicle.drive();
    }
}