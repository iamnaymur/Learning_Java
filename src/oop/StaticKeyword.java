package oop;

public class StaticKeyword {
    String name;
    int id;
    static String universityName = "SUB";

    StaticKeyword(String n, int i) {
        name = n;
        id = i;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("VarsityName: " + universityName);
    }
}
