package parkingLot;

import java.util.List;

import Entity.ParkingSpot;
import Entity.Vehicle;
import Entity.Ticket;
public class ParkingBuilding {
    private final List<ParkingLevel> parkingLevels;

    public ParkingBuilding(List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
    }
    public Ticket allocate(Vehicle vehicle){
        for(ParkingLevel level:parkingLevels) {
            if (level.checkAvailability(vehicle.getVehicleType())) {
                ParkingSpot spot = level.park(vehicle.getVehicleType());
                if (spot != null) {
                    Ticket ticket = new Ticket(vehicle, level, spot);
                    System.out.println("Parking allocated at level: "
                            + level.getLevelNumber()
                            + " spot: " + spot.getSpotId());
                    return ticket;
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }

    void release(Ticket ticket){
        ticket.getLevel().unPark(
            ticket.getVehicle().getVehicleType(),
            ticket.getSpot()
        );
    }
}
