import java.util.Scanner;

public class SamplEx {

    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            try {
                System.out.print("num? ");
                int num = keyboard.nextInt();
                System.out.println("f returned: " + f(num));
                done = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again");
            }
        }
        System.out.println("*** Goodbye");
    }

    static double f(int n) throws Exception {
        if (n < 0)
            throw new Exception("negative #");
        return Math.sqrt(n);
    }

    // this code if entered with -12 and 9 will print out the following:
    /*
    -12 <-- User input

    Since -12 is less than 0, the f method throws a exception for a negative number "negative #"
    This exception is caught and e.getMessage prints out the string

    negative #
    Please try again

    9 <-- User input

    Since 9 is a valid input according to the f function and is not less than 0, it returns a double for the squareroot of 9

    f returned: 3
    *** Goodbye
     */
}

