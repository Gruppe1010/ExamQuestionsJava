package com.company;

public abstract class Car {
    private int id;

    public Car() {
    }

    public Car(int id) {
        this.id = id;
    }

    public abstract void type();


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                '}';
    }
}
