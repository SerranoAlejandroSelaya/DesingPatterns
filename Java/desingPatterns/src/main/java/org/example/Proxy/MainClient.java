package org.example.Proxy;

public class MainClient {
    public static void main(String[] args) {
        Service proxyWithPermissions = new ServiceProxy(true);
        Service proxyWithoutPermissions = new ServiceProxy(false);

        Client clientWithPermissions = new Client(proxyWithPermissions);
        Client clientWithoutPermissions = new Client(proxyWithoutPermissions);

        System.out.println("Client with permissions:");
        clientWithPermissions.performOperations();

        System.out.println("\nClient without permissions:");
        clientWithoutPermissions.performOperations();
    }
}
