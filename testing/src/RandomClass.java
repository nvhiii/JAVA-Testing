/*
This class shows how random can be used in the most basic way!
 */

import java.util.Random;

public class RandomClass {

    public static void main(String [] args) {
        Random generator1 = new Random(2);
        System.out.println("From generator1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");

        System.out.print(" \n");

        Random generator2 = new Random(3);
        System.out.println("From generator2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");

    }
}


/*
Secure random is an import used for good cryptography purposes within
the field of randomization for security purposes
 */