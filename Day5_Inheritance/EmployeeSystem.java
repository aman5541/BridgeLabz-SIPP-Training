
package Day5_Inheritance;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String schoolName;

    Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.schoolName = school;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("School: " + schoolName);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Amit", 101, 80000, 5),
            new Developer("Sneha", 102, 60000, "Java"),
            new Intern("Rahul", 103, 15000, "IIT")
        };

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("-----------");
        }
    }
}
