package decorator.beverages;

public class Mocha implements Beverage {

    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public double cost() {
        return 3.5;
    }
}
