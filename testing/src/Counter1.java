public class Counter1 {

    private int counter;
    private int counterID;
    private static int nCounters;

    public Counter1(int counter) {
        this.counter = counter;
        nCounters++;
        counterID = nCounters;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getValue() {
        return counter;
    }

    public int getCounterID() {
        return counterID;
    }
}
