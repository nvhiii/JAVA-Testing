public class CircleWithStatic {

    double radius; // data field

    static int numberOfObjects = 0; // static variable

    CircleWithStatic() { // non-arg constructor
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStatic(double newRadius) { // constructor
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() { // method
        return numberOfObjects;
    }

    double getArea() { // method
        return Math.PI * radius * radius;
    }
}
