package dev.srivatsan.patterns.decorator;

abstract class CoffeeDecorator implements Coffee { // Abstract decorator class (wraps Coffee object)
    protected Coffee decoratedCoffee;  // Composition

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    // Can add methods that are common or default when the interface implementation is missing
}

class Milk extends CoffeeDecorator {
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

class Sugar extends CoffeeDecorator {
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
