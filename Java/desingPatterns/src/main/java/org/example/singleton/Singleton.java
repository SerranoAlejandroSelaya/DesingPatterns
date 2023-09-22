package org.example.singleton;

public class Singleton {
    private volatile static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            synchronized (Singleton.class) {
                if (instancia == null) {
                    instancia = new Singleton();
                }
            }
        }
        return instancia;
    }

    public String functionSingleton(){
        System.out.println("new fuction");
        return "status 200 OK";
    }
}
