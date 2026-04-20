import Entity.ParkingSpot;
import Entity.Ticket;
import Entity.Vehicle;
import LookUpStrategy.ParkingSpotLookUpStrategy;
import LookUpStrategy.RandomLookupStrategy;
import enums.VehicleType;
import parkingLot.*;
import payment.CashPayment;
import payment.UPIPayment;
import pricing.CostComputation;
import pricing.PricingStrategy;
import spotManagers.ParkingSpotManager;
import spotManagers.TwoWheelerSpotManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingSpotLookUpStrategy strategy = new RandomLookupStrategy();

        Map<VehicleType, ParkingSpotManager> levelOneManagers = new HashMap<>();
        levelOneManagers.put(VehicleType.TWO_WHELLER, new TwoWheelerSpotManager(
                List.of(new ParkingSpot("L1-S1"),new ParkingSpot("L1-S2")),
                strategy
        ));
        levelOneManagers.put(VehicleType.FOUR_WHELLER, new TwoWheelerSpotManager(
                List.of(new ParkingSpot("L1-S3"),new ParkingSpot("L1-S4")),
                strategy
        ));
        ParkingLevel level1=new ParkingLevel(1,levelOneManagers);
        ParkingBuilding parkingBuilding=new ParkingBuilding(
                List.of(level1)
        );
        PricingStrategy pricingStrategy=new CostComputation();
        ParkingLot parkingLot=new ParkingLot(
                parkingBuilding,
                new EntranceGate(),
                new ExitGate(pricingStrategy)
        );
        Vehicle bike = new Vehicle("BIKE-101", VehicleType.TWO_WHELLER);
        Vehicle car = new Vehicle("CAR-201", VehicleType.FOUR_WHELLER);

        Ticket t1=parkingLot.vehicleArrives(bike);
        Ticket t2=parkingLot.vehicleArrives(car);
        parkingLot.vehicleExits(t1,new CashPayment());
        parkingLot.vehicleExits(t2,new UPIPayment());

    }
}