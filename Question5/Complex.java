/*
Q 5: Print the sum, difference and product of two complex numbers by 
creating a class named 'Complex' with separate methods for each operation 
whose real and imaginary parts are entered by user.
*/
package com.Utkarsh;

import java.util.Scanner;

public class Complex{
    double real_part,imaginary_part;
    void add(double a, double c, double b,double d)
    {   real_part = (a+b);
        imaginary_part= (c+d);
        System.out.println("Addition is: "+real_part + " +  ("+ imaginary_part +"i )");
    }
    void sub(double a, double c, double b,double d)
    {   real_part = (a-b);
        imaginary_part= (c-d);
        System.out.println("Subtraction is: "+real_part + " +  ("+ imaginary_part +"i )");
    }
    void mul(double a, double c, double b,double d)
    {   real_part = (a*b-(c*d));
        imaginary_part= (a*d+(b*c));
        System.out.println("Multiplication is: "+real_part + " +  ("+ imaginary_part +"i )");
    }

    public static void main(String[] args) {
	// write your code here
        Complex cmp = new Complex();
        Scanner sc = new Scanner(System.in);
        double a,b,c,d;

        System.out.println("Enter the real part of 1st Complex No: ");
        a=sc.nextDouble();
        System.out.println("Enter the complex part of 1st Complex No: ");
        c=sc.nextDouble();
        System.out.println("Enter the real part of 2nd Complex No: ");
        b=sc.nextDouble();
        System.out.println("Enter the complex part of 2nd Complex No: ");
        d=sc.nextDouble();

        cmp.add(a,c,b,d);
        cmp.sub(a,c,b,d);
        cmp.mul(a,c,b,d);
    }
}
