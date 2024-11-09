import java.util.InputMismatchException;
import java.util.Scanner;

public class Parallelepiped {
    private double height;  //  высота
    private double length;   //  длина
    private double width;   //  ширина

    public Parallelepiped() {

    }

    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void areaParallelepiped(double height, double length, double width) {
        double area = 2 * ((height * length) + (length * width) + (height * width));
        System.out.println("Параллелепипеддин аянты:\t"+area);
    }

    public void volumeParallelepiped(double height, double length, double width) {
        double volume = height * length * width;
        System.out.println("Параллелепипеддин колому:\t"+volume);
    }
}


