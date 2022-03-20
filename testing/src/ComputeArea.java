import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {

        double radius, area;

        Scanner stdin = new Scanner(System.in);

        System.out.println("Please enter the circle's radius: ");
        radius = stdin.nextDouble();

        System.out.println("Calculating...");
        area = Math.PI * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
