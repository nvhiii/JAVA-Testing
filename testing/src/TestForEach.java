import java.util.ArrayList;
import java.util.Collection;

public class TestForEach {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));   // basically here the e is representing the collection of strings, and prints them into uppercase format

        // ^ the usage of the "->" is the same as using an anonymous inner class
    }
}
