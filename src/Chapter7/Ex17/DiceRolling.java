package Chapter7.Ex17;

import java.security.SecureRandom;

public class DiceRolling {
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int[] frequency = new int[13];

        for (int i = 0; i<36_000_000; i++){
            int dice1 = 1 + random.nextInt(6);
            int dice2 = 1 + random.nextInt(6);

            int sum = dice1 + dice2;

            ++frequency[sum];
        }

        System.out.printf("%s %s%n", "Sum", "Frequency");

        for (int i = 2; i<frequency.length; i++)
            System.out.printf("%2d %10d%n", i, frequency[i]);
    }
}
