public class GasTank3 {

    private double amount = 0;
    private double capacity;

    public GasTank3(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double x) {
        amount += x;
        if (amount > capacity) {
            amount = capacity;
        }
    }

    public void useGas(double y) {
        amount -= y;
        if (amount < 0) {
            amount = 0;
        }
    }

    public boolean isEmpty() {
        if (amount < 0.1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (amount > capacity-0.1) {
            return true;
        } else {
            return false;
        }
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        double diff = capacity - amount;
        this.amount += diff;
        return diff;
    }
}
