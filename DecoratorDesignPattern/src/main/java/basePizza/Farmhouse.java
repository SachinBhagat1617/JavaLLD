package basePizza;

public class Farmhouse implements BasePizza{
    @Override
    public int getCost() {
        return 210;
    }

    @Override
    public String getDescription() {
        return "FarmHouse Pizza";
    }
}
