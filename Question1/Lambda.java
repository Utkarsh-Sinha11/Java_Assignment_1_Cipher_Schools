/*
Q.1: Design a Calculator class which contains four lambda methods:
a. add(a, b)
b. difference(a, b)
c. product(a, b)
d. safeDivision(a, b)
Also design the main methods which pass actual parameters to test the 
Calculator class.
*/
package com.Utkarsh;
import java.util.Scanner;

class LambdaCalculator{
    interface add {
        void add(int a, int b);
    }

    interface difference {
        void difference(int a, int b);
    }

    interface product {
        void product(int a, int b);
    }

    interface safeDivision {
        void safeDivision(int a, int b);
    }
}

public class Lambda{
    public static void main(String[] args) {
        LambdaCalculator.add calculate_add = (a,b)-> System.out.println(a+b);
        LambdaCalculator.difference calculate_subtract= (a,b) -> System.out.println(a-b);
        LambdaCalculator.product calculate_product= (a,b)-> System.out.println(a*b);
        LambdaCalculator.safeDivision calculate_safe_division = (a,b)->{
            try{
                if (b==0)
                {
                    throw new ArithmeticException();
                }
                else
                {
                    System.out.println(a/b);
                }
            }catch (ArithmeticException e)
            {
                System.out.println("Division By Zero Denominator is NOT defined!!!");
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Integer: ");
        int input1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter 2nd Integer: ");
        int input2 = Integer.parseInt(sc.nextLine());

        calculate_add.add(input1,input2);
        calculate_subtract.difference(input1,input2);
        calculate_product.product(input1,input2);
        calculate_safe_division.safeDivision(input1,input2);

    }
}
