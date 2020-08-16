/*
Q.7: Write a program, creating a Triangle class which contains a method that takes
three parameters of the three sides of the triangle, ‘a’, ‘b’, ‘c’, and returns
you with the area of the triangle and print it.
*/

package com.Utkarsh;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle {

    double area(double a,double b,double c)
    {
        double s = (a+b+c)/2;
        double value = sqrt(s*(s-a)*(s-b)*(s-c));
        return value;
    }

    public static void main(String[] args){

        System.out.println("Enter the three sides of the triangle: ");
        Triangle T = new Triangle();
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double answer = T.area(a,b,c);
        System.out.println("Area of the Triangle is: " + answer);
    }
}
