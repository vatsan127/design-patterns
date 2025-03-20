package dev.srivatsan.patterns.factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new MargheritaPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();
        pizza.prepare();

        pizzaFactory = new PepperoniPizzaFactory();
        pizza = pizzaFactory.createPizza();
        pizza.prepare();
    }
}