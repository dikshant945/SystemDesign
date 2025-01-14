package FactoryMethod;

import FactoryMethod.PizzaType.CheesePizza;
import FactoryMethod.PizzaType.PepperoniPizza;
import FactoryMethod.PizzaType.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(pizza.equals("Cheese")) {
            pizza = new CheesePizza();
        }else if(pizza.equals("Veggie")){
            pizza = new VeggiePizza();
        }else{
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
