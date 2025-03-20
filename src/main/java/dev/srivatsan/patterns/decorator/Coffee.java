package dev.srivatsan.patterns.decorator;

// Base interface for all coffee types
public interface Coffee {
    String getDescription();

    double getCost();
}

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
