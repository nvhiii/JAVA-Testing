import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class myIterator {

    public static void main(String[] args) {

        Collection<String> myCollection = new ArrayList<>();

        myCollection.add("a");
        myCollection.add("b");
        myCollection.add("c");

        // for iterator, REMEMBER that u must declare an iterator e.g. below

        Iterator<String> myIterator = myCollection.iterator();

        while (myIterator.hasNext()) {

            System.out.print(myIterator.next() + " ");
        }

    }
}
