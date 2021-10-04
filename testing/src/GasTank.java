public class GasTank {
    
    private double amount = 0;
    
    public void addGas(double x) {
        amount += x;
    }
    
    public void useGas(double y) {
        amount -= y;
    }
    
    public double getGasLevel() {
        return this.amount = amount;
    }
}