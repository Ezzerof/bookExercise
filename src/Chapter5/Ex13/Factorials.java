/*
5.13. (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
    integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
    1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
    results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
*/

package Chapter5.Ex13;

public class Factorials {

    public static void main(String[] args) {

        for (int i = 1; i<=20; i++){

            long fact =1;

            for (int j = i; j>1; j--){
                fact *=j;

            }
            System.out.println(fact);
        }

    }
}
