/*
7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.
*/
package Chapter7.Ex12;

import java.util.Scanner;

public class DublicateElimination {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);


        for (int i = 0; i< numbers.length; i++) {

            System.out.println("Input 5 numbers (10 to 100)");
            int num = input.nextInt();

            if (num>=10 && num <=100) {
                numbers[i] = num;
                dublicateEliminator(numbers, i);
            }
            else {
                System.out.println("Wrong number!");
                break;
            }
        }
    }

    public static void dublicateEliminator(int[] arr, int index){

        System.out.print("\nUnique values: ");

        for (int i = 0; i <= index; i++){
            boolean uniq = true;

            for (int j = i+1; j <= index; j++){
                if (arr[j] == arr[i]){
                    uniq = false;
                    break;
                }
            }

            if (uniq) {
                for (int j = 0; j < i; j++){
                    if (arr[j] == arr[i]) {
                        uniq = false;
                        break;
                    }
                }
            }
            if (uniq)
                System.out.printf("%d ",arr[i]);
        }

        System.out.println("\n");

    }

}
