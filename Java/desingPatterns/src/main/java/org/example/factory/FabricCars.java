package org.example.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static java.util.Objects.isNull;

public class FabricCars {
    private Map<String, Supplier<Car>> fabricCars;

    public FabricCars(){
        fabricCars = new HashMap<>();
        fabricCars.put("Electric",ElectricCar::new);
        fabricCars.put("Gas",GasCar::new);
    }
    public Car createCar(String carType) throws IllegalAccessException {
        Supplier<Car> supplier = fabricCars.get(carType);
        if(isNull(supplier.get())){
            throw new IllegalAccessException("not valid type");
        }
        return supplier.get();
    }
}
