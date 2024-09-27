package oop.this_keyword;

public class Rectangle {
    int length, width;

    void setDimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println("The area of a rectangle is " + (length * width));
    }

    void printDetails() {
        this.setDimensions(32, 22);
        this.calculateArea();
    }
}
