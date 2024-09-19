package oop;

public class Teacher {
    String name, gender;
    int phone;

    void setInformation(String n, String g, int ph) {
        name = n;
        gender = g;
        phone = ph;
    }

    void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Name: " + gender);
        System.out.println("Name: " + phone);

    }
}
