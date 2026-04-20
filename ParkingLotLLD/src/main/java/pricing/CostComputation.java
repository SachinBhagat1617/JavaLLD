package pricing;

import Entity.Ticket;
import enums.VehicleType;

public class CostComputation implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        if(ticket.getVehicle().getVehicleType()== VehicleType.FOUR_WHELLER){
            return 200.00;
        }else{
            return 100.00;
        }
    }
}
