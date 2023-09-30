package com.workintech.cars;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        Car ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        Car holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}
