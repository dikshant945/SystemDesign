package FactoryMethod.PizzaStores;

import FactoryMethod.Pizza;
import FactoryMethod.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore(SimplePizzaFactory simplePizzaFactory) {
        super(simplePizzaFactory);
    }

    @Override protected Pizza createPizza(String type) {

    }
}
