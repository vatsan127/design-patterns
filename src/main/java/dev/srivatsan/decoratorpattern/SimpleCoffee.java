package dev.srivatsan.decoratorpattern;

// Concrete component (plain coffee)
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;  // Base price of coffee
    }
}
