package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(fin(8));
    }

    public static int fin(int n){
        int asw = 0;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n-1; i++){
            asw = a + b;
            a = b;
            b = asw;
        }
        return asw;
    }
}