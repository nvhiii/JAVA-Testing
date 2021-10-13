public class Telephone {

    private String number;
    private static int quantity;
    private static double total;

    public static String makeFullNumber(String number, int areaCode) {
        return areaCode + "-" + number;
    }

}
