package problems;

public class Box {
    double height, width, depth;

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        double volume = height * width * depth;
//        System.out.print("Volume is %.2f" + volume);
        System.out.printf("Volume is %.0f%n", volume);
    }

}
