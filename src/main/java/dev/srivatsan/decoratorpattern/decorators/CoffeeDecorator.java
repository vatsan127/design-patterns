package dev.srivatsan.decoratorpattern.decorators;

import dev.srivatsan.decoratorpattern.Coffee;

// Abstract decorator class (wraps Coffee object)
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;  // Composition

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();  // Delegate to wrapped object
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();  // Delegate to wrapped object
    }
}
