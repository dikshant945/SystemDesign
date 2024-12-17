package FactoryMethod;

import FactoryMethod.PizzaType.CheesePizza;
import FactoryMethod.PizzaType.PepperoniPizza;
import FactoryMethod.PizzaType.VeggiePizza;

public class PizzaFactory {
    Pizza pizza;

    public  PizzaFactory(String pizza){
        if(pizza.equals("Cheese")) {
            this.pizza = new CheesePizza();
        }else if(pizza.equals("Veggie")){
            this.pizza = new VeggiePizza();
        }else{
            this.pizza = new PepperoniPizza();
        }
    }
}
