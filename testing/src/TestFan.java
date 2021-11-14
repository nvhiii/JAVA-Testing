import java.util.Arrays;
import java.util.Scanner;

public class TestFan {

    public static void main(String[] args) {

        double r;
        String c;
        final int size = 2;

        Fan[] fanArray = new Fan[size];
        Scanner stdin = new Scanner(System.in);

        for (int i = 0; i < fanArray.length; i++) {

            System.out.println("Enter radius and color: ");
            r = stdin.nextDouble();
            c = stdin.next();   // when inputting, separate the two values by a singular whitespace

            fanArray[i] = new Fan(Fan.SLOW, false, r, c);

            shouldTurnOn(fanArray[i]);  // fills in array w appropriate values and decides to turn on or off the fan

        }

        for (int i = 0; i < fanArray.length; i++) { // created separate for loop b/c if I did it in the for loop to initialize values, I would get a NullPointerException

            for (int j = i+1; j<fanArray.length; j++) { // this is in comparison to line 27, it is the pointing to the 'next' location in the array

                if (fanArray[i].equals(fanArray[j])) {  // using .equals operator to compare strings, which in this case is 2 instances of same class
                    System.out.println(fanArray[i].toString());

                }
            }

        }

        System.out.println(Arrays.toString(fanArray));
    }

    public static void shouldTurnOn(Fan f) {

        String keyboardInput;

        Scanner stdin = new Scanner(System.in);
        System.out.println("Should the fan be turned on? (y/n)");

        keyboardInput = stdin.next();

        if (keyboardInput.equals("y")) {
            f.setOn(true);
            System.out.println("Fan has been turned on successfully");
        } else if (keyboardInput.equals("n")) {
            f.setOn(false);
            System.out.println("Fan has not been turned on");
        }

    }

    /*
    I decided to create the shouldTurnOn method here so I changed it to a static method, otherwise it couldnt be called by static main method // I couldve also left it in the fan class and left it a void class since its like a mutator

    ** Tips:
    Important:

    1. Getter (accessor) methods syntax:

        public returnType getSomething() {
            return something; // this assumes that something is an instance variable

    2. Mutator (setter) methods syntax:

        public void setSomething(dataType var) {
            this.var = var;

            or (if var is not same as instance var name)

            instanceVar = var;
        }

        ** Note that if ur varName is the same name as instance, please refer to instance var by saying this.var
        ** Otherwise, u can just say instanceVar = var

    3. Static methods can only call static methods refer to static variables

    4. Instance methods can call instance methods, static methods, and refer to instance and static methods

     */

}
