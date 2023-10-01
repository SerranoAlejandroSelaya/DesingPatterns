package org.example.decorator;

public abstract class CafeDecorator implements Cafe {
    protected Cafe decoratedCafe;

    public CafeDecorator(Cafe decoratedCafe) {
        this.decoratedCafe = decoratedCafe;
    }

    @Override
    public String obtainCoffee() {
        return decoratedCafe.obtainCoffee();
    }

    @Override
    public double getPrice() {
        return decoratedCafe.getPrice();
    }
}