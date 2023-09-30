package com.workintech.cars;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getName() + " the car's engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " the car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getName() + " the car is braking");
    }
}
