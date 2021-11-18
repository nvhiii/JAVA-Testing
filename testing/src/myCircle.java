import java.awt.*;

public class myCircle {

    private Point center;   // assuming the point is the center
    private double radius;

    public myCircle(Point center, double radius) {
        this.center = center;
        this.radius = radius; // this.radius refers to instance variable in line 6
    }

    public double enlarge() {
        return radius++;
    }

    public double distance(myCircle other) {
        return this.center.distance(other.center);
    }

    // will need to revisit this code a bit later

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Center: " + center + "\nRadius: " + radius; // delegation
    }

    public boolean equals(myCircle other) {
        return center.equals(other.center) && radius == other.radius;   // .equals used to compare two objects, == operator to compare primitive types other than strings
    }
    // also delegation

    public static void main(String[] args) {
/*
        myCircle circle1 = new myCircle(1,1);

        myCircle circle2 = new myCircle(3, 3);

        System.out.println(circle1.enlarge());

        System.out.println(circle1.getArea());

        System.out.println(distance(circle1, circle2));


 */


    }


}
