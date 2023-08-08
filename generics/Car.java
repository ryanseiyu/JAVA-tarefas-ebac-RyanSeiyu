package generics;

import java.util.ArrayList;

public abstract class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void drive();

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Sedan("Toyota", "Camry", 2021);
        Car car2 = new SUV("Jeep", "Grand Cherokee", 2022);

        cars.add(car1);
        cars.add(car2);

        for (Car car : cars) {
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear());
        }
    }
}

class Sedan extends Car {
    public Sedan(String make, String model, int year) {
        super(make, model, year);
    }

    public void drive() {
        System.out.println("Driving a sedan");
    }
}

class SUV extends Car {
    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    public void drive() {
        System.out.println("Driving an SUV");
    }
}