/*
6.23 (Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint
numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the result.
 */

package Chapter6.Ex23;
import java.util.Scanner;

public class FindTheMinimum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input three float numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        input.close();

        System.out.println(minium3(num1,num2,num3));

    }

    public static float minium3(float a, float b, float c)
    {
        return Math.min(a,Math.min(b,c));
    }
}
