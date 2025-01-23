package FactoryMethod;

import FactoryMethod.PizzaStores.NYPizzaStore;
import FactoryMethod.PizzaStores.PizzaStore;
import java.util.ArrayList;
import java.util.List;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
