package dev.srivatsan.decoratorpattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());

        // Adding Milk
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());

        // Adding Sugar
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());

        // Adding More Milk
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());
    }
}
