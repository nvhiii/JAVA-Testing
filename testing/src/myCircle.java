import java.awt.*;

public class myCircle {

    private Point center;   // assuming the point is the center
    private double radius;

    public myCircle(Point center, double radius) {
        this.center = center;
        this.radius = radius; // this.radius refers to instance variable in line 6
    }

    public double enlarge() {
        return radius += 1;
    }

    public static double distance(myCircle c1, myCircle c2) {

        Point point1 = c1.center;
        Point point2 = c2.center;

        return 0;

    }

    // will need to revisit this code a bit later

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        myCircle circle1 = new myCircle(1,1);

        myCircle circle2 = new myCircle(3, 3);

        System.out.println(circle1.enlarge());

        System.out.println(circle1.getArea());

        System.out.println(distance(circle1, circle2));

    }


}
