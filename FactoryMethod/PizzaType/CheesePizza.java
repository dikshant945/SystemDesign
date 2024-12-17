package FactoryMethod.PizzaType;

import FactoryMethod.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza Prepared !");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza Baked !");
    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza Cutted");
    }

    @Override
    public void box() {
        System.out.println("Cheese Pizza Boxed");
    }
}
