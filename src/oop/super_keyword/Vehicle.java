package oop.super_keyword;

public class Vehicle {
    String color;
    double weight;

    Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;

    }

    void displayCarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
