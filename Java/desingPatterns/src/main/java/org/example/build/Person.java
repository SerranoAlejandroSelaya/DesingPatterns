package org.example.build;

public class Person {
    private String nombre;
    private int edad;
    private String direccion;

    private Person(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public static class Builder {
        private String nombre;
        private int edad;
        private String direccion;

        public Builder() {
            // TODO document why this constructor is empty
        }

        public Builder name(String name) {
            this.nombre = name;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}

