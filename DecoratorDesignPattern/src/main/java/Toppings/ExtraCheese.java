package Toppings;

import basePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
     public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
     }

     @Override
     public int getCost(){
         return basePizza.getCost() + 30;
     }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+" + Extra Cheese";
    }

}
