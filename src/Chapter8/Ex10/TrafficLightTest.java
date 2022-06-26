package Chapter8.Ex10;

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light   Duration ");

        for (TrafficLightEx light : TrafficLightEx.values()) {
            System.out.printf("%-20s%d%n", light, light.getDuration());
        }
    }
}
