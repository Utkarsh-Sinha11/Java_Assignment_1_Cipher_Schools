/*
Q.6: Write a program, creating a class which contains a method that would print
the information (name, year of joining, salary, address) of three employees
by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining         Address
Robert      1994                    64C- WallStreet
Sam         2000                    68D- WallStreet
John        1999                    26B- WallStreet
*/
package com.Utkarsh;
import java.util.Scanner;

class Employee {
    String Name;
    int year;
    String Address;

    void print() {
        System.out.print(Name +"           " + year + "                " + Address);
        System.out.println();
    }

    public static void main(String[] args) {
        // first object
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of 1st employee: ");
        System.out.println("Name: ");
        emp1.Name = sc.nextLine();
        System.out.println("Address: ");
        emp1.Address = sc.nextLine();
        System.out.println("Enter Year of Joining: ");
        emp1.year = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the details of 2nd employee: ");
        System.out.println("Name: ");
        emp2.Name = sc.nextLine();
        System.out.println("Address: ");
        emp2.Address = sc.nextLine();
        System.out.println("Enter Year of Joining: ");
        emp2.year = Integer.parseInt(sc.nextLine());


        System.out.println("Enter the details of 3nd employee: ");
        System.out.println("Name: ");
        emp3.Name = sc.nextLine();
        System.out.println("Address: ");
        emp3.Address = sc.nextLine();
        System.out.println("Enter Year of Joining: ");
        emp3.year = Integer.parseInt(sc.nextLine());

        System.out.println("Name:    " + "Year of Joining:  " + "             Address          ");
        emp1.print();
        emp2.print();
        emp3.print();
    }

}
