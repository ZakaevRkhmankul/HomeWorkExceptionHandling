import java.util.Scanner;

public class Cylinder {

    private double radius;
    private double height;
    private double PI;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, double PI) {
        this.radius = radius;
        this.height = height;
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double cylindersArea(double radius, double height, double PI) {
        return 2*PI * radius*( height + radius);
    }

    public double cylinderVolume(double radius, double height, double PI) {
        return (PI * radius * radius * height);
    }
}
