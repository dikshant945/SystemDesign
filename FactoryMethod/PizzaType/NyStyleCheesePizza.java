package FactoryMethod.PizzaType;

import FactoryMethod.Pizza;
import java.util.ArrayList;
import java.util.List;

public class NyStyleCheesePizza extends Pizza {

    public NyStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}


