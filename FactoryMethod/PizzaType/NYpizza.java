package FactoryMethod.PizzaType;

import FactoryMethod.Pizza;

public class NYpizza implements Pizza {
    @Override public void prepare() {
        System.out.println("Ny PizzaPrepared");
    }

    @Override public void bake() {
        System.out.println("Ny baked");
    }

    @Override public void cut() {
        System.out.println("NyPizza cutted");
    }

    @Override public void box() {
        System.out.println("NyPizza boxed");
    }
}
