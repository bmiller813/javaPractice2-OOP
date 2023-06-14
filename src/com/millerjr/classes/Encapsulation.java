package com.millerjr.classes;

public class Encapsulation {

    public static void main (String[] args){
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(0);
        System.out.println(wage);
    }
}
