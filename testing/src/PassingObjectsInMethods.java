public class PassingObjectsInMethods {

    public static void main(String [] args) {

        Circle myCircle = new Circle();
        printCircle(myCircle);
    }

    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " +
                c.getRadius() + " is " + c.getArea());
    }
}
