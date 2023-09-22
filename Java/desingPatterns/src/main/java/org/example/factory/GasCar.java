package org.example.factory;

public class GasCar implements Car{
    @Override
    public int speedUp() {
        System.out.println("gas speed up");
        return 1;
    }

    @Override
    public int stop() {
        System.out.println("gas stop");
        return -1;
    }
}
