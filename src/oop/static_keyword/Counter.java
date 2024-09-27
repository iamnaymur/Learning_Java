package oop.static_keyword;

public class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    void increment() {
        System.out.println("From counter class," + count);
    }
}
