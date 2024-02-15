package ru.diana.autopark.entity;

public class Car {
    public String brand;
    public String color;
    public static int count = 0;

    public Car () {

    }

    public Car (String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrake () {
        return "тормозит";
    }
    public String getDrive () {
        return "едет";
    }


}
