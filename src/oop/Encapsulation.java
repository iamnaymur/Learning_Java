package oop;

public class Encapsulation {
    public int age;
    private String name;

    // Setter method to set both age and name
    void setterMethod(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Method to return both age and name as a single string
    String getDetails() {
        return "Name: " + name + ", Age: " + age + 15;
    }
}
