package oop;

public class Teacher {
    String name, gender;
    int phone, number;


    //constructor with parameters
    Teacher(String cName, String cGender, int cPhone) {
        name = cName;
        gender = cGender;
        phone = cPhone;
    }

//    Just a method to compare with constructor
    int multiplyValue(int v) {
        return v * v;
    }

    //default constructor
    Teacher() {
        System.out.println("No value.");
    }


    // Initializing without a constructor
//    void setInformation(String n, String g, int ph) {
//        name = n;
//        gender = g;
//        phone = ph;
//    }

    void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone : " + phone);

    }
}
