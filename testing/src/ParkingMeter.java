public class ParkingMeter {
    
    private int timeLeft = 0;
    
    public boolean add(int x) {
        if (x == 25) {
            timeLeft += 30;
            return true;
        } else {
            return false;
        }
    }
    
    public void tick() {
        if (timeLeft > 0) 
            timeLeft--;
    }
    
    public boolean isExpired() {
        if (timeLeft == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}