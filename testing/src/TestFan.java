public class TestFan {

    public static void main(String[] args) {

        Fan[] fanArray = new Fan[2];

        for (int i = 0; i < fanArray.length; i++) {
            fanArray[i] = new Fan();
            System.out.println(fanArray[i]);
        }

        Fan fan = new Fan();
        fan.shouldTurnOn();
    }

}
