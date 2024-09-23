package oop;

public class VarArgs {
    int sum = 0;

    void add(int... param) {
        for (int x : param) {
            sum += x;
        }
        System.out.println("Sum: " + sum);
    }
}
