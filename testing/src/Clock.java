public class Clock {

    private int hours;
    private boolean isTicking;
    private Integer diff;

    public Clock(Clock c) {

        this.hours = c.hours;
        this.isTicking = c.isTicking;
        this.diff = c.diff;

    }
}
