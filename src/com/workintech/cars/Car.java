package com.workintech.cars;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        setEngine(true);
        setWheels(4);
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " the car's engine is starting");
    }
    public void accelerate(){
        System.out.println(getClass().getSimpleName() + " the car is accelerating");
    }
    public void brake(){
        System.out.println(getClass().getSimpleName() + " the car is braking");
    }
}
