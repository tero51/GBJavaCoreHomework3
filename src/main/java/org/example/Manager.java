package org.example;

public class Manager extends Employee{
    public Manager(String name, double salary, int year, int month, int day, Male male) {
        super(name, salary, year, month, day, male);
    }

    public static void increaseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) { employee.salary += amount; }
        }
    }
}
