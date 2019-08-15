package com.example.controller;

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

    public static String numberOfEmployeesPerDepartment(Employee[] employees) {
        String department = null;
        int numberOfEmployeesIT = 0;
        int numberOfEmployeesManagement = 0;
        int numberOfEmployeesSupport = 0;

        for (int i = 0; i < employees.length; i++) {
            department = employees[i].getDepartment().toLowerCase();
            if (department.equals("it")) {
                numberOfEmployeesIT++;
            }
            if (department.equals("management")) {
                numberOfEmployeesManagement++;
            }
            if (department.equals("support")) {
                numberOfEmployeesSupport++;
            }
        }
        return "Liczba pracowników w dziale IT: " + numberOfEmployeesIT
                + "\nLiczba pracowników w dziale Management: " + numberOfEmployeesManagement
                + "\nLiczba pracowników w dziale Support: " + numberOfEmployeesSupport;
    }
}
