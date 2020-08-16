/*
Q.2: Create two classes:
BaseClass
The Rectangle class should have two data fields-width and height of int types.
The class should have display() method, to print the width and height of the rectangle
separated by space.
DerivedClass
The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of
Rectangle class.The class should have read_input() method, to read the values of width
and height of the rectangle. The class should also overload the display() method to
print the area (width*height) of the rectangle.
Output Format:
The output should consist of:
Print the width and height of the rectangle.
In the second line, print the area of the rectangle.
*/
package com.Utkarsh;
import java.util.Scanner;

class Rectangle{
    int width;
    int height;
    void display()
    {
        System.out.println("Width: "+width+" Height: "+height);
    }
}

class RectangleArea extends Rectangle{

    Scanner sc = new Scanner(System.in);
    public void read_input(){
        width = Integer.parseInt(sc.nextLine());
        height = Integer.parseInt(sc.nextLine());
    }
    public void display(){
        super.display();
        System.out.println("Area: " + height*width);
    }
}

public class MainRectangle {
    public static void main(String[] args) {
        RectangleArea RA = new RectangleArea();
        RA.read_input();
        RA.display();
    }
}
