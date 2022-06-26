/*
8.4. (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
 */
package Chapter8.Ex4;

public class RectangleClass {

    private double length = 1;
    private double width = 1;


    public void setValue(double length, double width){

        if (length > 0.0 && length < 20.0)
            this.length = length;
        else
            System.out.println("Wrong value of length.");

        if (width > 0.0 && width < 20.0)
            this.width = width;
        else
            System.out.println("Wrong value of width.");

    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }





}
