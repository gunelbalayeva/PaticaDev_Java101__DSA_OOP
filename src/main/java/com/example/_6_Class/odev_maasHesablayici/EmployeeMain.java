package com.example._6_Class.odev_maasHesablayici;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Gunel", 1500, 45, 10);
        employee.raiseSalary();
        employee.bonus();
        employee.tax();
        System.out.println(employee);
    }
}
