package org.example.build;

public class MainBuild {
    public static void main(String[] args) {
        System.out.println(
                Person.builder().name("ale").build()
        );
    }
}
