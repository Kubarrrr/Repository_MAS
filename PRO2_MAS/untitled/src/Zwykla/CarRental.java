package Zwykla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRental {
    String name;
    int capacity;
    ArrayList<Car> cars;

    public CarRental(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }

    public void addCar(Car car) {
        if (cars.size() + 1 > capacity) {
            throw new IllegalArgumentException("Wypozyczalnia jest pełna!!");
        } else {
            if (!cars.contains(car)) {
                cars.add(car);
                car.setCarRental(this);
            } else {
                System.out.println("Samochod jest w wypozyczalni!");
            }
        }
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public ArrayList<Car> getCarsWithColor(String color) {
        System.out.println("Samochody o kolorze: " + color + " w wypozyczalni " + name);
        ArrayList<Car> carsWithColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.color.equals(color)) {
                carsWithColor.add(car);
            }
        }
        return carsWithColor;
    }

    public ArrayList<Car> getCarsCheaperThan(double price) {
        System.out.println("Samochody o cenie mniejszej niz: " + price + " w wypozyczalni " + name);
        ArrayList<Car> carsCheaperThanPrice = new ArrayList<>();
        for (Car car : cars) {
            if (car.price < price) {
                carsCheaperThanPrice.add(car);
            }
        }
        return carsCheaperThanPrice;
    }

    public void getCars() {
        System.out.println(this.name);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
