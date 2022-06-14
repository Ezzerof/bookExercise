package Chapter7.Ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommissions {

    public static int WEEKLY_SALARY = 200;
    public static ArrayList<Integer> empSal = new ArrayList<Integer>();

    public static void main(String[] args) {

        int[] frequency = new int[11];

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the gross of the employee: ");
        int gross = input.nextInt();
        addSalary(gross);

        while (gross != -1)
        {
            System.out.println("Please enter the gross of the employee: ");
            gross = input.nextInt();
            addSalary(gross);

            if (gross == -1)
                break;
        }


        for (int wage: empSal)
        {
            int result = wage / 100;
            ++frequency[result > 10 ? 10 : result];
        }

        // Printing amount
        for (int i = 2; i < frequency.length; i++)
        {
            if (i == 10)
                System.out.println("$1000 and over");
            else
                System.out.printf("$%d - %d%n", i * 100, i * 100 + 99);

            for (int star = 0; star < frequency[i]; star++)
                System.out.print("*");

            System.out.println();
        }

    }

    public static void addSalary(int gross)
    {
        int sum = (int) (WEEKLY_SALARY + (0.09 * gross));
        empSal.add(sum);
    }
}
