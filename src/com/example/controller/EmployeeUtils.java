package com.example.controller;

import com.example.model.Employee;

import java.util.Comparator;

public class EmployeeUtils {
    public static double averageSalary(Employee[] employees) {
        double averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary();
        }
        return averageSalary / employees.length;
    }

    public static double minSalary(Employee[] employees) {
        double result = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (result > employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }
        return result;
    }

    public static double maxSalary(Employee[] employees) {
        double result = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (result < employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }
        return result;
    }

    public String numberOfEmployeesPerDepartment(Employee[] employees) {
        int result = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().toLowerCase().equals())
        }
    }
}
