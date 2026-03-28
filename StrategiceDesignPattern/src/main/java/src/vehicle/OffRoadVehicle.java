package src.vehicle;

import src.DriveStrategy.DriveStrategy;
import src.DriveStrategy.SportDrive;

public class OffRoadVehicle extends Vehicle {  // off-road vehicle is a type of vehicle, so it extends Vehicle inheritance
    public OffRoadVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
