package org.example;

public class Manager extends Employee{
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public static void increaseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) { employee.salary += amount; }
        }
    }
}
