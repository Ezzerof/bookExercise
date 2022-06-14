/*
6.14 (Exponentiation) Write a method integerPower(base, exponent) that returns the value of
base exponent
For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
Do not use any Math class methods. Incorporate this method into an application that reads
integer values for base and exponent and performs the calculation with the integerPower method.
*/
package Chapter6.Ex14;

public class Exponentiation {

    public static int sum = 0;


    public static int integerPower(int base, int exponent)
    {
        int n = 0;
        sum = base;
        while (n !=exponent)
        {
            if (exponent <=0)
                System.out.println("The exponent is less than 0.");
            else
                sum *= base;

            n++;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(integerPower(3,4));

    }

}