package org.example.factory;

public class MainFabric {
    public static void main(String[] args) throws IllegalAccessException {
        FabricCars fabricCars = new FabricCars();

        Car car= fabricCars.createCar("Electric");
        System.out.println(car);
        System.out.println(car.speedUp());
    }
}
