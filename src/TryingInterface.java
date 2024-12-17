interface Drawable {
    void draw();

    static void painted() {
        System.out.println("This work");
    }

    default void kamHoitase() {
        System.out.println("This work");
    }

    final int x = 1000;
    static int y = 200;
}

interface Movable {
    void moveTo(int x, int y);

}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Kisu ekta");
    }

}

public class TryingInterface {
    public static void main(String[] args) {
        // Circle c = new Circle();

        student s = new student();
        s.myName();
        s.myBou();
        System.out.println(s.x);
        // c.draw();
    }
}

abstract class myDetails {
    abstract void myName();

    abstract void myBou();

    int x = 100;

}

class student extends myDetails {
    @Override
    void myName() {
        System.out.println("Naymur Rahman Tushar");
    }

    void myBou() {
        System.out.println("Naiga keu");
    }
}
