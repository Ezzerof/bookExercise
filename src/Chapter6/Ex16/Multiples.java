/*
6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.
*/

package Chapter6.Ex16;

public class Multiples {

    public static void main(String[] args) {

        System.out.println(isMultiple(4,10));

    }

    public static boolean isMultiple(int a, int b)
    {
        return b % a == 0 ? true:false;
    }

}
