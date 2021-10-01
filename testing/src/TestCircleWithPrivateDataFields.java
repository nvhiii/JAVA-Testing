public class TestCircleWithPrivateDataFields {

    public static void main(String [] args) {

        CirclePrivateDataFields myCircle = new CirclePrivateDataFields(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() +
                " is " + myCircle.getArea());   // public method invoked

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() +
                " is " + myCircle.getArea());   // public method invoked

        System.out.println("The number of objects created is " + CirclePrivateDataFields.getNumberOfObjects()); // public method invoked
    }
}
