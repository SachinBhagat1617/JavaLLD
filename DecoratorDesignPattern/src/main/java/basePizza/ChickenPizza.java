package basePizza;

public class ChickenPizza implements BasePizza{
    @Override
    public int getCost() {
        return 230;
    }

    @Override
    public String getDescription() {
        return "Chicken Pizza";
    }
}
