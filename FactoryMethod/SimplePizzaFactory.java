package FactoryMethod;

import FactoryMethod.PizzaType.CheesePizza;
import FactoryMethod.PizzaType.PepperoniPizza;
import FactoryMethod.PizzaType.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("Cheese")) {
            pizza = new CheesePizza();
        }else if(type.equals("Veggie")){
            pizza = new VeggiePizza();
        }else{
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
