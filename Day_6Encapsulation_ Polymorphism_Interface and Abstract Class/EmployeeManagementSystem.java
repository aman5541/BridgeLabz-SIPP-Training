import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedBonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double fixedBonus) {
        super(id, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 30000, 5000);
        emp1.assignDepartment("Finance");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 10000, 20, 300);
        emp2.assignDepartment("Support");
        employees.add(emp1);
        employees.add(emp2);
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("--------------------------");
        }
    }
}
