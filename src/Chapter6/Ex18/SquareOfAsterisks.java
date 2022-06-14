/*
6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer parameter
side. For example, if side is 4, the method should display
****
****
****
****
*/
package Chapter6.Ex18;

public class SquareOfAsterisks {

    public static void main(String[] args) {

        squareOfAsterisks(6);

    }

    public static void squareOfAsterisks(int a)
    {
        for (int j = 0; j < a; j++)
        {
            for (int i = 0; i < a; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
