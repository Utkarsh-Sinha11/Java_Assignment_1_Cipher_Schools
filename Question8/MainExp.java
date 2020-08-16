/*
Q.8: Write a program, creating a class containing the generic method which 
accepts only numbers, generating a custom exception when passed with the 
String value.
The functionality of the generic method is to print the 2/3 of the passed 
value.
*/

package com.Utkarsh;
import java.util.Scanner;

class UserException extends Exception {
    public UserException() {
        System.out.println("Error!!! Handling Custom Exception \n String Found......");
    }
}

class UserExceptionClass {
    public <Template> void UserMethod(Template Input) {
        try {
            if (Input instanceof String)
            { throw new UserException();
            }
            double number = Double.parseDouble(String.valueOf(Input));
            System.out.println(number * 0.66666667);
            }
            catch (UserException e)
            {
            System.out.println(e.getMessage());
            }
    }
}

public class MainExp{
    public static void main(String[] args) {
        UserExceptionClass obj = new UserExceptionClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        obj.UserMethod(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter a String: ");
        obj.UserMethod(Integer.parseInt(sc.nextLine()));
    }
}