public class Err2 {

    /*

    THIS IS THE PROBLEM CODE
    public static void main(String[] args) {
        method1();
    }
    public void method1() {
        method2();
    }
    public static void method2() {
        System.out.println("Hello World");
    }

    ERROR: a static method cannot call upon an instance method
     */

    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        method2();
    }
    public static void method2() {
        System.out.println("Hello World");
    }

    // resolved the issue by adding the static keyword to method1

}
