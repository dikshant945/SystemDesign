package FactoryMethod.PizzaStores;

import FactoryMethod.Pizza;
import FactoryMethod.SimplePizzaFactory;

public abstract class PizzaStore {
    SimplePizzaFactory factory;


    protected abstract Pizza createPizza(String type);


    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.bake();
        pizza.box();
        pizza.cut();
        pizza.prepare();
        return pizza;
    }
}
