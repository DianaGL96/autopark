package ru.diana.autopark.main;

import ru.diana.autopark.entity.Car;

public class Main {
    public static void main (String[] args) {
        Car auto1 = new Car("BMW", "red");
        Car.count++;

        Car auto2 = new Car("Mitsubishi", "white");
        Car.count++;

        Car auto3 = new Car();
        auto3.brand = "Porsche";
        auto3.color = "blue";
        Car.count++;

        System.out.println("На автопарке есть " + Car.count + " машины - " + auto1.brand + "(" + auto1.color + ")," + auto2.brand + "(" + auto2.color + ")," + auto3.brand + "(" + auto3.color + ").");
        System.out.println("Сейчас " + auto1.brand + " - " + auto1.getDrive() + ", "  + auto2.brand + " - " + auto2.getBrake() + ", " + auto3.brand + " - " + auto3.getBrake() + ".");
    }
}
