package Toppings;

import basePizza.BasePizza;

// Topping Decorator is a basePizza only with another basePizza
public abstract class ToppingDecorator implements BasePizza { // Topping Decorator with toppings and base Pizza is a Base Pizza
    // has-a relationship basePizza has toppingsDecorator
    BasePizza basePizza; // shared dependency / state -> use abstract class to avoid code duplication
    public ToppingDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
}