/*Q 4
A class called circle is designed as shown in the following class diagram. It contains:
• Two private instance variables: radius (of the type double) and color
(of the type String), with default value of 1.0 and "red", respectively.
• Two overloaded constructors - a default constructor with no argument,
and a constructor which takes a double argument for radius.
• Two public methods: getRadius() and getArea(), which return the
radius and area of this instance, respectively.
 */

package com.Utkarsh;

import java.util.Scanner;

public class Circle {

    private double radius;
    private String color = "red";

    Circle()
    {
        radius = 1.0;
    }

    Circle(double r)
    {
        this.radius = r;
    }

    double getRadius()
    {
        return radius;
    }

    double getArea()
    {
        return (3.14159*radius*radius);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Output of Default constructor: ");
        Circle c1 = new Circle();
        System.out.println("Radius is: "+c1.getRadius());
        System.out.print("Area is: ");
        System.out.format("%.3f", c1.getArea());
        System.out.println();

        System.out.println("Output of Parameterized constructor: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Radius: ");
        int input_radius = Integer.parseInt(sc.nextLine());
        Circle c2 = new Circle(input_radius);
        System.out.println("Radius is: "+c2.getRadius());
        System.out.print("Area is: ");
        System.out.format("%.3f", c2.getArea());

    }
}
