import java.util.ArrayList;


class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    public void showDetails() {
        System.out.println("  - Employee: " + name);
    }
}


class Department {
    String name;
    ArrayList<Employee> employees;

   
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        Employee newEmployee = new Employee(empName);
        employees.add(newEmployee);
    }

    public void showDepartment() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.showDetails();
        }
    }
}
class Company {
    String name;
    ArrayList<Department> departments;
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }
    public void showCompany() {
        System.out.println("\nCompany: " + name);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
    public void deleteCompany() {
        departments.clear();
        System.out.println("\n" + name + " and all departments and employees deleted.");
    }
}


public class CompanyApp {
    public static void main(String[] args) {
       
        Company company = new Company("TechSoft");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.departments.get(0).addEmployee("John");
        company.departments.get(0).addEmployee("Sara");
        company.departments.get(1).addEmployee("Emily");
        company.showCompany();
        company.deleteCompany();
    }
}
