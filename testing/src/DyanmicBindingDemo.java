public class DyanmicBindingDemo {

    public static void main(String[] args) {
        m(new Student());
        m(new Person());
        m(new Object());

    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}

/** 
 * Because method m has param Object, the declared type methods override the actual type object toString method
*/



