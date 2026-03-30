package Toppings;

import basePizza.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
    // has-a relationship basePizza has toppingsDecorator
    BasePizza basePizza; // shared dependency / state -> use abstract class to avoid code duplication
    public ToppingDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
}