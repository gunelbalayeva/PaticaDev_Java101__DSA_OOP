package com.example._6_Class.odev_maasHesablayici;

import java.util.Date;

public class Employee {
    String employeeName;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.employeeName = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    //Vergi hesablayan metod
    void tax() {
        double taxAmount = 0;

        if (salary <= 1000) {
            taxAmount = 0.00;
        } else if (salary > 1000 && salary <= 2000) {
            taxAmount = (salary - 1000) * 0.3;
        }
        double netIncome = salary - taxAmount;
    }

    void bonus() {
        if (workHours >= 40) {
            int hourlyRate = 0;
            int extraHours = workHours - 40;
            salary = salary + 30 + (extraHours * hourlyRate);
        }
    }

    void raiseSalary() {
        int currentYear = 2024;
        hireYear = currentYear - hireYear;
        if (hireYear >= 10) {
            double raiseSalary = salary * 0.5 * hireYear;
            salary += raiseSalary;
        }
        if (hireYear >= 9 && hireYear <= 20) {
            double raiseSalary = salary * 0.10 * hireYear;
            salary += raiseSalary;
        }
        if (hireYear >= 19) {
            double raiseSalary = salary * 0.15 * hireYear;
            salary += raiseSalary;
        }
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------");
        System.out.println("Employee name: " + this.employeeName);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        return " ";
    }
}

