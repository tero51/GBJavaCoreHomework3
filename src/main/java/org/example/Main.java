package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("В простонародье Санчоус", 50000, 2020, 7, 11, Male.MALE);
        Employee emp2 = new Employee("Великая отрыжка", 52500, 2018, 1, 15, Male.FEMALE);
        Manager manager = new Manager("Несносный прыщ", 101000, 2016, 4, 2, Male.MALE);

        Employee[] employees = {emp1, emp2, manager};
        Manager.increaseSalary(employees,250);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Employee.congratulateEmployees(employees);
    }
}