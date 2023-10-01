package org.example.Proxy;

public class ServiceProxy implements Service {
    private RealService realService;
    private boolean hasPermissions;

    public ServiceProxy(boolean permissions) {
        this.hasPermissions = permissions;
    }

    @Override
    public void successfulOperation() {
        if (hasPermissions) {
            if (realService == null) {
                realService = new RealService();
            }
            realService.successfulOperation();
        } else {
            System.out.println("You do not have permissions to perform this successful operation.");
        }
    }

    @Override
    public void failedOperation() {
        if (hasPermissions) {
            if (realService == null) {
                realService = new RealService();
            }
            realService.failedOperation();
        } else {
            System.out.println("You do not have permissions to perform this failed operation.");
        }
    }
}