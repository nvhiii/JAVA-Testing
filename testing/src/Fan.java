import java.util.Scanner;

public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
       speed = SLOW;
       on = false;
       radius = 5;
       color = "blue";  // don't need this keyword b/c there aren't object instance variables inside the param
    }

    // Above is the no-arg constructor

    public Fan(int speed, boolean onOrOff, double radius, String color) {

        this.speed = speed;
        this.on = onOrOff;
        this.radius = radius;
        this.color = color;     // this-keyword only used when param is same name as instance var

    }

    // Above is the args-constructor

    public String toString() {
        return "speed: " + getSpeed() + "\nOn or off: " + getOn() + "\nRadius: " + getRadius() + "\nColor: " + getColor();
    }

    // toString method is above

    public boolean equals(Fan other) {
        return other.speed == speed && other.on == on && other.radius == radius && other.color.equals(color);
    }

    // equals method is above

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // the four methods above are the accessors

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void setOn(boolean x) {
        on = x;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setString(String newColor) {
        color = newColor;
    }

    // the four methods above are the setters

    public static Fan read(Scanner sc) {

        if (!sc.hasNext()) {
            return null;
        }
        double radius = sc.nextDouble();
        String color = sc.next();
        return new Fan(SLOW, false, radius, color);

        // to call this in the main method just do:

        //    fansArray[i] = Fan.read(scanner);
    }


}
