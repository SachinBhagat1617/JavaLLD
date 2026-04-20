package pricing;

import Entity.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
