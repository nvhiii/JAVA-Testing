import java.util.Scanner;

/*

    This is a way to inappropriately handle the exception b/c exception handling should be taken care by the exception object

*/
public class QuoientWithIf {

    public static void main(String [] args) {
        
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter two integers: ");

        int number1 = stdin.nextInt();
        int number2 = stdin.nextInt();

        if (number2 != 0) {
            System.out.println(number1 + " / " + number2 + " is " + (number1/number2));

        } else {
            System.out.println("Divisor cannot be zero ");
        }
    }
    
}
