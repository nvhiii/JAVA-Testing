 public class TotalArea {

    public static void main(String [] args) {

        Circle [] circleArray;  // declare circleArray

        circleArray = createCircleArray();  // create circleArray (Array of objects)

        printCircleArray(circleArray);
    }

    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return  circleArray; // return array of objects
    }

    public static void printCircleArray(Circle[] circleArray) { // pass array of objects
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("— — — — — — — — — — — — — — — — — — — — — — — — — — — —");

        System.out.printf("%-30s%-15s\n", "The total area of circles is", sum(circleArray));
    }

    public static double sum(Circle[] circleArray) { // pass array of objects

        double sum = 0;

        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();
        return sum;
    }
}
