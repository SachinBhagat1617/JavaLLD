package parkingLot;

import Entity.Ticket;
import payment.Payment;
import pricing.CostComputation;
import pricing.PricingStrategy;

public class ExitGate {
    private final PricingStrategy pricingStrategy;

    public ExitGate(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void completeExit(ParkingBuilding building,
                             Ticket ticket,
                             Payment payment){
        double amount=pricingStrategy.calculate(ticket);
        boolean success=payment.pay(amount);
        if (!success) {
            throw new RuntimeException("Payment failed. Exit denied.");
        }

        building.release(ticket);
        System.out.println("Exit successful. Gate opened. Paid Amount: "+amount);
    }

}
