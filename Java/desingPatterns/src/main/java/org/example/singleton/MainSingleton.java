package org.example.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton ins1 = Singleton.getInstance();
        Singleton ins2 = Singleton.getInstance();

        System.out.println(ins1.equals(ins2));

        ins2.functionSingleton();
        ins1.functionSingleton();
    }
}
