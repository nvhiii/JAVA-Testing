import java.util.Scanner;

public class QuotientWithMethod {

    public static int quotient(int number1, int number2) {

        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return number1 / number2;
    }


    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("enter two integers: ");

        int number1 = stdin.nextInt();
        int number2 = stdin.nextInt();

        int result = quotient(number1, number2);

        System.out.println(number1 + " / " + number2 + " is " + result);
    }
    
}
