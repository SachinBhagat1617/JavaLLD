package basePizza;

public class CheesyPizza implements BasePizza{

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Chessy Pizza";
    }
}
