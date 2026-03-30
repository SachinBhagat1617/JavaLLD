package Toppings;

import basePizza.BasePizza;

public class ExtraVeggie extends ToppingDecorator{
    public ExtraVeggie(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+ 50;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+" + Extra Veggie";
    }
}
