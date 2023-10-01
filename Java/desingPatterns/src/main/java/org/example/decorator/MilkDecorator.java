package org.example.decorator;

public class MilkDecorator extends CafeDecorator {
    private final double milkPrice = 5.0;

    public MilkDecorator(Cafe decoratedCafe) {
        super(decoratedCafe);
    }

    @Override
    public String obtainCoffee() {
        return super.obtainCoffee() + " with Milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + milkPrice;
    }
}
