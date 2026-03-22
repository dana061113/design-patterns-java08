package decorator;

import decorator.beverages.*;
import decorator.decorators.*;

public class Main {
    public static void main(String[] args) {

        Beverage drink = new Espresso();
        drink = new Milk(drink);
        drink = new Sugar(drink);

        System.out.println(drink.getDescription());
        System.out.println("Total: $" + drink.cost());
    }
}
