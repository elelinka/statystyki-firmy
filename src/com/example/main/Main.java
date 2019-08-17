package com.example.main;

import com.example.utils.EmployeeFileReader;
import com.example.utils.EmployeeFileWriter;
import com.example.model.Employee;

public class Main {
    public static void main(String[] args) {
        String pathToRead = "C:\\Users\\grego\\Desktop\\lista_pracownikow.csv";
        String pathToWrite = "C:\\Users\\grego\\Desktop\\statystyki.txt";
        Employee[] employees = EmployeeFileReader.readEmployeeFile(pathToRead);
        EmployeeFileWriter.writeEmployeesToFile(pathToWrite, employees);
    }
}