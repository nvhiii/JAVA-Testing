public class Accumulator1 {

    private int sum;

    public Accumulator1(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void add(int x) {
        sum += x;
    }
}
