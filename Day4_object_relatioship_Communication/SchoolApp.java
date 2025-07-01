import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enroll(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.courses.add(this);  
        }
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.name);
        }
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course math = new Course("Math");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        math.enroll(s1);
        math.enroll(s2);
        science.enroll(s1);

        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();
        math.showStudents();
    }
}

