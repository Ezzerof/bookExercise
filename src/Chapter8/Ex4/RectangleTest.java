package Chapter8.Ex4;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {

        RectangleClass rectangle = new RectangleClass();
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();

        rectangle.setValue(length,width);
        System.out.println("Area of the rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle is: " + rectangle.getPerimeter());


    }
}
