package LookUpStrategy;

import Entity.ParkingSpot;

import java.util.List;

public class RandomLookupStrategy implements ParkingSpotLookUpStrategy{
    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> spots) {
        for(ParkingSpot spot:spots){
            if(spot.isAvailable()){
                return spot;
            }
        }
        return null;
    }
}
