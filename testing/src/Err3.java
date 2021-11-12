import java.util.Date;

public class Err3 {

    /*

    THIS IS THE PROBLEM CODE

    public static void main(String[] args) {
        Date date = null;
        method1(date);
        System.out.println(date);
    }
    public static void method1(Date date) {
        date = new Date(); // instantiates a Date object with today's date
    }
    ERROR: NULL POINTER EXCEPTION
     */

    public static void main(String[] args) {

        Date date = new Date();
        method1(date);
        System.out.println(date);
    }

    public static Date method1(Date date) {
        return date = new Date(); // instantiates a Date object with today's date
    }


    // I changed the method1 return type, and instantiated a new object date before calling method1 on the instantiated object

/*
// OR APPROACH LIKE THIS
    public static void main(String[] args) {
        Date date = new Date();
        method1(date);
    }
    public static void method1(Date date) {
        date = new Date(); // instantiates a Date object with today's date
        System.out.println(date);
    }

   // Here, I added the print statement to the method1, and still instantiated a new date obj to avert the nullpointerexception
 */
}
