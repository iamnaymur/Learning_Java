package oop.static_keyword;

public class Test {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.increment();
        System.out.println("Line 6," + Counter.count);

        Counter counter2 = new Counter();
        System.out.println("Line 9," + Counter.count);
        counter2.increment();

    }
}
