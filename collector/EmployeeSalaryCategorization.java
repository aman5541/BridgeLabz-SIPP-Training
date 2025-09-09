package collector;
import java.util.*;
import java.util.stream.*;

class EmployeeSalaryCategorization {
    static class Employee {
        String name;
        String department;
        double salary;
        Employee(String name, String department, double salary) { this.name = name; this.department = department; this.salary = salary; }
        String getDepartment() { return department; }
        double getSalary() { return salary; }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 70000),
            new Employee("David", "IT", 80000)
        );

        Map<String, Double> avgSalary = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalary);
    }
}


