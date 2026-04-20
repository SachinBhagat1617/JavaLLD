package spotManagers;

import Entity.ParkingSpot;
import LookUpStrategy.ParkingSpotLookUpStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    public FourWheelerParkingSpotManager(List<ParkingSpot> spots, ParkingSpotLookUpStrategy strategy) {
        super(spots, strategy);
    }
}
