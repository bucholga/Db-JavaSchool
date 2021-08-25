package day7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(EmployeeSalary.sortedSalary(List.of(new Employee("Vasya", 13), new Employee("Petya", 9), new Employee("Vanya", 10))));
        //System.out.println(MapEmployee.employeeMap(List.of(new Employee("Vasya", 13), new Employee("Petya", 9), new Employee("Vanya", 10)));
    }
}
