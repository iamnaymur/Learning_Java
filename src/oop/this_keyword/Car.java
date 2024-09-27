package oop.this_keyword;

public class Car {
    String color, modelName;


    Car(String modelName) {
        this.modelName = modelName;
    }

    Car(String color, String modelName) {
        this(modelName);
        this.color = color;
    }

    Car(String Color, int dummy) {
        this.color = Color;
    }

    void printDetails() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + modelName);
    }
}
