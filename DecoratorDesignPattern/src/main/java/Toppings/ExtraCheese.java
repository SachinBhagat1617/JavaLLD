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

//
//
//public class ExtraCheese implements BasePizza{
//    private BasePizza basePizza;// code duplication in every Toppings class so we use abstract class
//    public ExtraCheese(BasePizza basePizza){
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
