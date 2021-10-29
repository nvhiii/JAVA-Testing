public class SQRTException extends Exception {
    public SQRTException(double d) {
        super("Bad argument to sqrt: " + d);
    }
}
