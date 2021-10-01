public class CirclePrivateDataFields {

    private double radius = 1; // private data field (encapsulation)

    private static int numberOfObjects = 0; // encapsulation

    public CirclePrivateDataFields() { // constructor no-args
        numberOfObjects++;
    }

    public CirclePrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() { // accessor method
        return radius;
    }

    public void setRadius(double newRadius) { // mutator method
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberOfObjects() { // accessor method
        return numberOfObjects;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
