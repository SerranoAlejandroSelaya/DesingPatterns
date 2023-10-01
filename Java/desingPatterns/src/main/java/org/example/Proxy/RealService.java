package org.example.Proxy;

public class RealService implements Service {
    @Override
    public void successfulOperation() {
        System.out.println("Successful operation in the real service.");
    }

    @Override
    public void failedOperation() {
        System.out.println("Failed operation in the real service.");
    }
}