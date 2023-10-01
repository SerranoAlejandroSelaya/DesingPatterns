package org.example.decorator;

public class Client {
    public static void main(String[] args) {
        // Create a base Moka coffee
        Cafe mokaCoffee = new Moka();

        // Decorate the Moka coffee with Milk
        Cafe milkMoka = new MilkDecorator(mokaCoffee);

        // Decorate the Milk Moka coffee with Sugar
        Cafe sugarMilkMoka = new SugarDecorator(milkMoka);

        // Display the coffee details and price
        System.out.println("Coffee: " + sugarMilkMoka.obtainCoffee());
        System.out.println("Price: $" + sugarMilkMoka.getPrice());
    }
}
