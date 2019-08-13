package com.example.main;

import com.example.controller.EmployeeFileReader;
import com.example.controller.EmployeeUtils;
import com.example.model.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\grego\\Desktop\\lista_pracownikow.csv";
        Employee[] employees = EmployeeFileReader.readEmployeeFile(path);
        System.out.println(Arrays.toString(employees));
        System.out.println("Średnia wypłata: " + EmployeeUtils.averageSalary(employees));
        System.out.println("Najmniejsza wypłata: " + EmployeeUtils.minSalary(employees));
        System.out.println("Największa wypłata: " + EmployeeUtils.maxSalary(employees));
    }
}