import java.util.Scanner;

public class Quotient {

    /*

    This is a way to find the quotient without the remainder in java

    */
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter two integers: ");

        int number1 = stdin.nextInt();
        int number2 = stdin.nextInt();

        System.out.println(number1 + " / " + number2 + " is " + 
            (number1/number2));

    }
    
}
