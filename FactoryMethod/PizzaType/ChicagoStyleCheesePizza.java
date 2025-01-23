package FactoryMethod.PizzaType;

import FactoryMethod.Pizza;
import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {
    List<String> toppings = new ArrayList<>();

    public ChicagoStyleCheesePizza() {
        String name = "Chicago Style Cheese Pizza";
        String dough = "Chicago Style Cheese Dough";
        String sauce = "Chicago Style Cheese Sauce";

        toppings.add("Chicago Style Toppings");
    }

    @Override
    public void cut(){
        System.out.println("Chicago Style Pizza cutting");
    }


}
