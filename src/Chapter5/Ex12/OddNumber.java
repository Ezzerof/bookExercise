/*
5.12. (Calculating the Product of Odd Integers) Write an application that calculates the product
of the odd integers from 1 to 15.
*/
package Chapter5.Ex12;

public class OddNumber {

    public static void main(String[] args) {

        int sum = 1;

        for (int i=1; i <= 15;i++){

            if (i%2==0){
                sum *= i;
            }

        }
        System.out.println(sum);

    }
}