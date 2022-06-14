/*
5.16. (Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For example,
if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.
*/

package Chapter5.Ex16;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {

        int a = 0;
        int[] numbers = new int[5];

        while(a!=5){

            Scanner input = new Scanner(System.in);
            System.out.println("Input a number between 1 and 30: ");
            int n = input.nextInt();

            if (n <= 30){

                numbers[a] = n;

            }else{

                System.out.println("Wrong number.");
                break;
            }

            a++;
        }

        System.out.println("The Bar Chart for the numbers: ");

        for (int z = 0; z<5; z++) {

            for (int i = 0; i < numbers[z]; i++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
