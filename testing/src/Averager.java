public class Averager {
    
    private int sum = 0;
    private int count = 0;
    
    public int getSum() {
        return this.sum = sum;
    }
    
    public void add(int x) {
        sum += x;
        count++;
    }
    
    public int getCount() {
        return this.count = count;
    }
    
    
    
    public double getAverage() {
        return (double)sum/(double)count;
    }
}