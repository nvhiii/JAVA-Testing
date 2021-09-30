public class TestCircle {

    public static void main(String[] args) { // this is the one public class which is the name for the java file & also main method

        Circle circle1 = new Circle(); // object created
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }
}

class Circle {
    double radius; // data field

    Circle() {    // no-arg constructor
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }


}

/*
Please keep in mind this is code may be in accordance to some textbook work!!
 */
