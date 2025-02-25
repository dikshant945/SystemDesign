package FactoryMethod.PizzaStores;

import FactoryMethod.Pizza;
import FactoryMethod.PizzaType.NyStyleCheesePizza;
import FactoryMethod.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NyStyleCheesePizza();
        }
         else return null;
    }
}
