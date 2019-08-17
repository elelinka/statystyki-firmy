package com.example.utils;

import com.example.model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeFileReader {
    public static Employee[] readEmployeeFile(String path) {
        Employee[] employees = new Employee[4];
        int index = 0;

        try {
            FileReader file = new FileReader(path);
            BufferedReader bFile = new BufferedReader(file);
            String nextLine;
            while ((nextLine = bFile.readLine()) != null) {
                String[] lines = nextLine.split(";");
                employees[index] = new Employee(lines[0], lines[1], lines[2], lines[3], Double.parseDouble(lines[4]));
                index++;
            }
        } catch (IOException e) {
            System.err.println("Nie odnaleziono pliku.");
        }
        return employees;
    }
}
