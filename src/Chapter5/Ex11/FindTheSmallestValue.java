/*
5.11. (Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.
*/
package Chapter5.Ex11;

import java.util.Scanner;

public class FindTheSmallestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of value to input: ");
        int totalValue = input.nextInt();

        int smallest = 0;

        for (int i = 0; i<totalValue; i++){
            System.out.println("Enter an integer: ");
            int number = input.nextInt();

            if (i == 0){
                smallest = number;
            }

            if (number<smallest){
                smallest = number;
            }

        }
        System.out.println("The smallest number is: " + smallest);
    }
}
