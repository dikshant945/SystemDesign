package FactoryMethod.PizzaType;

import FactoryMethod.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PepperoniPizza Pizza Prepared !");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza Pizza Baked !");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza Pizza Cutted");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza Pizza Boxed");
    }
}
