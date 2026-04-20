package pricing;

import Entity.Ticket;

public class FixedPricingStrategy implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        return 100.00;
    }
}
