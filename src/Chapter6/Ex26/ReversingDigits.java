/*
6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
the method into an application that reads a value from the user and displays the result.
 */
package Chapter6.Ex26;
import java.util.Scanner;

public class ReversingDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number for reversing: ");
        int num = input.nextInt();
        System.out.println(reversing(num));
        input.close();

    }

    public static int reversing(int a)
    {
        int reverted = 0;

        while (a != 0)
        {

            int rem = a % 10;
            a /=10;
            reverted = rem + 10 * reverted;

        }
        return reverted;

    }
}
