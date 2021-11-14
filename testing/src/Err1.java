public class Err1 {

    /*

    THIS IS THE PROBLEM CODE
    public static void main(String[] args){
        Circle c;
        c.setRadius(2);
        System.out.println("radius of c is " + c.getRadius());
    }

    ERROR: the circle object is never instantiated properly
     */

    public static void main(String[] args){
        Circle c = new Circle();
        c.setRadius(2);
        System.out.println("radius of c is " + c.getRadius());
    }

    // the solution is just to instantiate the circle object properly, assuming that there is a class with the appropriate methods

}
