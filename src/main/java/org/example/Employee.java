package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee {
    protected String name;
    protected double salary;
    protected LocalDate date;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.date = LocalDate.of(year, month, day);
    }

    public static int compareDates(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return name + ", salary: " + salary + ", date: " + date.format(formatter);
    }
}
