public class WeatherForecast {

    private String skies = "";
    private int high = 0;
    private int low = 0;

    public void setSkies(String skies) { // setter method(s) (often public void)
        this.skies = skies;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public String getSkies() { // accessor method(s)
        return skies;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

}
