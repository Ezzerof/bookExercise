/*
6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
        whether an integer is even. The method should take an integer argument and return true if the integer
        is even and false otherwise. Incorporate this method into an application that inputs a sequence
        of integers (one at a time) and determines whether each is even or odd.
*/
package Chapter6.Ex17;

public class EvenOdd {

    public static void main(String[] args) {

        System.out.println(isEvenOdd(5));

    }

    public static boolean isEvenOdd(int a)
    {
        return a%2==0 ? true:false;

    }
}
