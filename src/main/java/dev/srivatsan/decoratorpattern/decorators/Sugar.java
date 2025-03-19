package dev.srivatsan.decoratorpattern.decorators;


import dev.srivatsan.decoratorpattern.Coffee;

// Sugar decorator
public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 5.0;  // Adding cost of sugar
    }
}
