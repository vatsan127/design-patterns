package dev.srivatsan.decoratorpattern.decorators;

import dev.srivatsan.decoratorpattern.Coffee;

// Milk decorator
public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 10.0;  // Adding cost of milk
    }
}

