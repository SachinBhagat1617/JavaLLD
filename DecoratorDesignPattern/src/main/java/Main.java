import Toppings.ExtraCheese;
import Toppings.ExtraVeggie;
import basePizza.BasePizza;
import basePizza.CheesyPizza;
import basePizza.Farmhouse;

public class Main {
    public static void main(String []args){
        BasePizza pizza1=new ExtraCheese(new Farmhouse());
        System.out.println("Pizza 1 cost "+pizza1.getCost()+pizza1.getDescription());
        BasePizza pizza2=new ExtraVeggie(new ExtraCheese(new CheesyPizza()));
        System.out.println("Pizza 2 cost "+pizza2.getCost()+pizza2.getDescription());
    }
}
