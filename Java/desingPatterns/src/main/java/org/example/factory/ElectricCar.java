package org.example.factory;

public class ElectricCar implements Car{
    @Override
    public int speedUp() {
        System.out.println("speed up electric");
        return 1;
    }

    @Override
    public int stop() {
        System.out.println("stop electric");
        return -1;
    }

    @Override
    public String toString() {
        return "elecric";
    }
}
