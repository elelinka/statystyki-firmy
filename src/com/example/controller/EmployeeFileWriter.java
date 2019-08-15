package com.example.controller;

import com.example.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFileWriter {
    public static void writeEmployeesToFile(String path, Employee[] employees) {
        File employeesFile = new File(path);

        try {
            FileWriter eFileWrite = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(eFileWrite);
            bufferedWriter.write(EmployeeUtils.minSalary(employees));
            bufferedWriter.newLine();
            bufferedWriter.write(EmployeeUtils.maxSalary(employees));
            bufferedWriter.newLine();
            bufferedWriter.write(EmployeeUtils.averageSalary(employees));
            bufferedWriter.newLine();
            bufferedWriter.write(EmployeeUtils.numberOfEmployeesPerDepartment(employees));
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("nie odnaleziono pliku");
        }

        if (!employeesFile.exists()) {
            try {
                employeesFile.createNewFile();
            } catch (IOException e) {
                System.out.println("plik już istnieje");
            }
        }
    }
}
