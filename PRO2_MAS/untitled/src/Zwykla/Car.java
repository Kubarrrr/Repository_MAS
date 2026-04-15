package Zwykla;

import java.util.ArrayList;

public class Car {
    int id;
    String model;
    double price;
    String vin;
    String color;
    CarRental carRental;
    private static ArrayList<Car> extent = new ArrayList<>();

    public Car(int id, String model, double price, String vin, String color, CarRental carRental) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.vin = vin;
        this.color = color;
        this.carRental = carRental;
        carRental.addCar(this);

        extent.add(this);
    }

    public CarRental getCarRental() {
        return carRental;
    }

    public void setCarRental(CarRental newCarRental) {
        if (carRental != newCarRental) {
            CarRental oldCarRental = carRental;
            carRental = newCarRental;

            if (oldCarRental != null) {
                oldCarRental.removeCar(this);
            }
            if (newCarRental != null) {
                newCarRental.addCar(this);
            }
        }

    }

    public void showCarsWithColor(String color) {
        for (Car car : extent) {
            if (car.color.equals(color)) {
                System.out.println(car);
            }
        }
    }

    public void showAllCars() {
        for (Car car : extent) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return model + " " + price + " " + vin + " " + color;
    }
}
