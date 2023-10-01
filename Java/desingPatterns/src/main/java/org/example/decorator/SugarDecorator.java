package org.example.decorator;

public class SugarDecorator extends CafeDecorator {
    private final double sugarPrice = 2.0;

    public SugarDecorator(Cafe decoratedCafe) {
        super(decoratedCafe);
    }

    @Override
    public String obtainCoffee() {
        return super.obtainCoffee() + " with Sugar";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + sugarPrice;
    }
}
