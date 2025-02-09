package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee {
    protected String name;
    protected double salary;
    protected LocalDate date;
    public final Male gender;

    public Employee(String name, double salary, int year, int month, int day, Male gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.date = LocalDate.of(year, month, day);
    }

    public static void congratulateEmployees(Employee[] employees) {
        for (Employee employee: employees) {
            System.out.println(employee.getName() + ", " + Holiday.NEW_YEAR.getMessage());
            if (employee.getGender() == Male.FEMALE) {
                System.out.println(employee.getName() + ", " + Holiday.WOMENS_DAY.getMessage());
            } else if (employee.getGender() == Male.MALE) {
                System.out.println(employee.getName() + ", " + Holiday.DEFENDERS_DAY.getMessage());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Male getGender() {
        return gender;
    }

    public static int compareDates(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date.format(formatter) +
                ", gender=" + gender +
                '}';
    }
}
