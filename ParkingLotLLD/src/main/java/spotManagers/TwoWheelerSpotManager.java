package spotManagers;


import Entity.ParkingSpot;
import LookUpStrategy.ParkingSpotLookUpStrategy;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {
    public TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookUpStrategy strategy) {
        super(spots, strategy);
    }
}
