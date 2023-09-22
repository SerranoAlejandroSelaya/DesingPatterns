package org.example.decorator;

public class Moka implements Cafe{
    private final double price = 22.3;

    @Override
    public String optainCoffe() {
        return "IS Moka";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
