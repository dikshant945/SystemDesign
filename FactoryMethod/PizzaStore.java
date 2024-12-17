package FactoryMethod;

public class PizzaStore {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Cheese");
    }

    public void orderPizza(String pizzaName) {
        PizzaFactory pizzaFactory = new PizzaFactory(pizzaName);
        Pizza pizza = pizzaFactory.pizza;
        pizza.bake();
        pizza.box();
    }

}
