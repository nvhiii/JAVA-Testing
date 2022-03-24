import java.util.ArrayList;
import java.util.Collection;

public class myForEach {

    public static void main(String[] args) {

        Collection<String> newCollection = new ArrayList<>();

        newCollection.add("xyz");
        newCollection.add("abc");
        newCollection.add("nop");

        newCollection.forEach(e -> System.out.print(e + " "));
    }
}
