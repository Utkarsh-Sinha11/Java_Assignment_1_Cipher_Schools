/*Q.3: Write a program, creating an Employee class containing details of empId,
empName, empDesignation, empSalary and empLocation. Create necessary methods like
getters, setters and toString. Create 10 instances of the same.
The problem is to generate stream of all the instances and do the following operations:
a. Print the name of all the employees.
b. Print all the salaries which are greater than 50,000/-
c. Print all the locations starting with the letter ‘M’
d. Print all the designations ending with ‘E’*/

package com.Utkarsh;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeStream{

    EmployeeStream()
    {
    }

    int empID;
    String empName;
    String empDesignation;
    double empSalary;
    String empLocation;

    public void setEmpID(int x)
    {
        this.empID = x;
    }

    public int getEmpID()
    {
        return empID;
    }

    public void setEmpName(String x)
    {
        this.empName = x;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpDesignation(String x)
    {
        this.empDesignation = x;
    }

    public String getEmpDesignation()
    {
        return empDesignation;
    }

    public void setEmpSalary(double x)
    {
        this.empSalary = x;
    }

    public double getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpLocation(String x)
    {
        this.empLocation = x;
    }

    public String getEmpLocation()
    {
        return empLocation;
    }
    public String toString(){

        int ID = this.empID;
        String Name =  this.empName;
        String Designation = this.empDesignation;
        double Salary = this.empSalary;
        String Location = this.empLocation;

        return ID+"        "+Name+"        "+Designation+"        "+Salary+"        "+Location;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employess: ");
        int numberofemployees = Integer.parseInt(sc.nextLine());
        EmployeeStream[] EmployeeArray = new EmployeeStream[numberofemployees];

        for(int i=0;i<numberofemployees;i++)
        {
            System.out.println("Enter Details of Employee "+ (i+1));
            System.out.print("Employee ID: ");
            EmployeeArray[i] = new EmployeeStream();
            EmployeeArray[i].setEmpID(Integer.parseInt(sc.nextLine()));
            System.out.print("Employee Name: ");
            EmployeeArray[i].setEmpName(sc.nextLine());
            System.out.print("Employee Designation: ");
            EmployeeArray[i].setEmpDesignation(sc.nextLine());
            System.out.print("Employee Salary: ");
            EmployeeArray[i].setEmpSalary(Double.parseDouble(sc.nextLine()));
            System.out.print("Employee Location: ");
            EmployeeArray[i].setEmpLocation(sc.nextLine());
        }

        System.out.println("Names of all Employees: ");
        Arrays.stream(EmployeeArray).forEach(employee->{
            System.out.println(employee.getEmpName());
        });

        System.out.println("All the salaries which are greater than 50,000/-: ");
        Arrays.stream(EmployeeArray).filter(employee->employee.getEmpSalary()>50000).forEach(employee->{
            System.out.println(employee.getEmpID()+"           "+employee.getEmpName()+"         "+employee.getEmpSalary());
        });

        System.out.println("All the locations starting with the letter ‘M’");
        Arrays.stream(EmployeeArray).filter(employee->employee.getEmpLocation().startsWith("M")).forEach(employee->{
            System.out.println(employee.getEmpLocation());
        });

        System.out.println("All the designations ending with ‘E’");
        Arrays.stream(EmployeeArray).filter(employee->employee.getEmpDesignation().endsWith("E")).forEach(employee->{
            System.out.println(employee.getEmpDesignation());
        });
    }
}
