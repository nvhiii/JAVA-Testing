import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {

        // good example of a FIFO collection, Queue (first in, first out)

        Queue<String> queue = new LinkedList<>();
        queue.offer("nice");
        queue.offer("ooga booga");
        queue.offer("3rd");

        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
    }
}
