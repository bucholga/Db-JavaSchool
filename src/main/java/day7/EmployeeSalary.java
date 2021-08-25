package day7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {
    public static List<String> sortedSalary(List<Employee> employees){
        List<String> salaryes = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());
        return salaryes;
    }
}
