import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class myArrayListandLinkedList {

    public static void main(String[] args) {

        // since a few java versions ago, the right-side for the arrow brackets don't need the Type
        ArrayList<Object> collectionOfObjects = new ArrayList<>();

        collectionOfObjects.add('a');
        collectionOfObjects.add("1");
        collectionOfObjects.add(1);

        Iterator<Object> objectIterator = collectionOfObjects.iterator();
        while (objectIterator.hasNext()) {
            System.out.print(objectIterator.next() + " ");
        }

        System.out.println();

        collectionOfObjects.forEach(e -> System.out.println(e));

        LinkedList<Integer> collectionOfInt = new LinkedList<>();

        collectionOfInt.add(7);
        collectionOfInt.addFirst(69);
        collectionOfInt.addLast(420);
        collectionOfInt.add(20);



    }
}
