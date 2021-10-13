public class GasTankUpdated {
    
    private double amount = 0;
    
    public void addGas(double x) {
        amount += x;
    }
    
    public void useGas(double y) {
        if (amount >= 0) {
            amount -= y;
        } else {
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
    
    public double getGasLevel() {
        return this.amount = amount;
    }
    
    // i like pie
}