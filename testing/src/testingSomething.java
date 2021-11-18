import java.util.ArrayList;
import java.util.Arrays;

public class testingSomething {

    public static void main(String[] args) {

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.sort(list);
        System.out.println(java.util.Collections.max(list));
        System.out.println(list);

        java.util.Collections.shuffle(list);
        System.out.println(list);

    }
}
