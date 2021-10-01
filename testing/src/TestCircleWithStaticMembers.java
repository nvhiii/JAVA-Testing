public class TestCircleWithStaticMembers {

    public static void main(String [] args) {
        System.out.println("Before creating objects");
        System.out.println("the number of Circle objects is " +
                CircleWithStatic.numberOfObjects); // static variable

        CircleWithStatic c1 = new CircleWithStatic();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + // instance variable
                ") and number of Circle objects (" +
                c1.numberOfObjects + ")"); // static variable

        CircleWithStatic c2 = new CircleWithStatic(5);

        c1.radius = 9; // instance variable

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" +
                c1.numberOfObjects + ")"); // static variable
        System.out.println("c2: radius (" + c2.radius +
                ") and number of Circle objects (" +
                c2.numberOfObjects + ")"); // static variable
    }
}

/*
Instance method - needs an object of class to be created before getting called
                + need to create object for this, thus often has no args

Static methods - can just be called without creation of object
                + cannot create object for this method type !!!
                + usually has args!!
                + also has the keyword STATIC

Instance data fields - often are just data type followed by var = value !!
 */