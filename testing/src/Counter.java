public class Counter {

    private int counter;
    private int limit;

    private static int nCounters = 0;

    public Counter(int counter, int limit) {
        this.counter = counter;
        this.limit = limit;
        nCounters++;
    }

    public void increment() {
        if (counter < limit)
            counter++;
    }

    public void decrement() {
        if (counter > 0)
            counter--;
    }

    public int getValue() {
        return counter;
    }

    public static int getNCounters() {
        return nCounters;
    }
}

