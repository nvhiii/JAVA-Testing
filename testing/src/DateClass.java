/*
System.curentTimeMillis() = good for time in ms
THE DATE CLASS IS USEFUL FOR TIME EXTRACTION / GETTIME WORKS WITH JAN 1, 1970
 */


public class DateClass {
    public static void main(String [] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since Jan 1, 1970 is "
                + date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
}
