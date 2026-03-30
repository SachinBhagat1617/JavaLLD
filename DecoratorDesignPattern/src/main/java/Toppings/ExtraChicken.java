package Toppings;

import basePizza.BasePizza;

public class ExtraChicken extends ToppingDecorator{

    public ExtraChicken(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+45;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+" + Extra Chicken";
    }
}
