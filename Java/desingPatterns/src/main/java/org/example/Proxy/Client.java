package org.example.Proxy;

public class Client {
    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void performOperations() {
        System.out.println("Performing successful operation:");
        service.successfulOperation();

        System.out.println("\nPerforming failed operation:");
        service.failedOperation();
    }
}