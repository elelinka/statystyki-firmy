package com.example.utils;

import com.example.model.Employee;

public class EmployeeUtils {
    public static String averageSalary(Employee[] employees) {
        double averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary();
        }
        averageSalary /= employees.length;
        return "Średnia wypłata: " + averageSalary;
    }

    public static String minSalary(Employee[] employees) {
        double result = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (result > employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }
        return "Najmniejsza wypłata: " + result;
    }

    public static String maxSalary(Employee[] employees) {
        double result = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (result < employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }
        return "Największa wypłata: " + result;
    }

    public static String numberOfEmployeesPerDepartment(Employee[] employees, String department) {
        int numberOfEmployees = 0;

        for (int i = 0; i < employees.length; i++) {
            if (department.toLowerCase().equals(employees[i].getDepartment().toLowerCase())) {
                numberOfEmployees++;
            }
        }
        return "Liczba pracowników w dziale " + department.toUpperCase() + ": " + numberOfEmployees + "\n";
    }
}
