import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showUniversity() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            d.show();
        }
    }

    void deleteUniversity() {
        departments.clear();  
        System.out.println(name + " and its departments have been deleted.");
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        Department cs = new Department("Computer Science");
        Department bio = new Department("Biology");

        Faculty f1 = new Faculty("Dr. Rajdeep"); 
        Faculty f2 = new Faculty("Dr. Jones");

        uni.addDepartment(cs);
        uni.addDepartment(bio);

        uni.showUniversity();
        f1.show();
        f2.show();
        uni.deleteUniversity();
    }
}
