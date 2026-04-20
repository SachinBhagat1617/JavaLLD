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
//
//
//public class ExtraChicken implements BasePizza{
//    private BasePizza basePizza;// code duplication in every Toppings class so we use abstract class
//    public ExtraChicken(BasePizza basePizza){
//        this.basePizza=basePizza;
//    }
//
//    @Override
//    public int getCost() {
//        return 0;
//    }
//
//    @Override
//    public String getDescription() {
//        return "";
//    }
//}
