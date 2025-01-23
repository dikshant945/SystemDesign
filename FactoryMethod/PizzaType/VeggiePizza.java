package FactoryMethod.PizzaType;

import FactoryMethod.Pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie Pizza Prepared !");
    }

    @Override
    public void bake() {
        System.out.println("Veggie Pizza Baked !");
    }

    @Override
    public void cut() {
        System.out.println("Veggie Pizza Cutted");
    }

    @Override
    public void box() {
        System.out.println("Veggie Pizza Boxed");
    }
}
