import java.util.*;

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println("Professor " + prof.name + " is assigned to course " + name);
    }

    void enrollStudent(Student student) {
        students.add(student);
        student.courses.add(this);
        System.out.println(student.name + " enrolled in course " + name);
    }

    void showDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Taught by: " + professor.name);
        }
        System.out.println("Enrolled students:");
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
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.name);
        }
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class UniversityManagementApp {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");

        Course c1 = new Course("Math");
        Course c2 = new Course("Physics");

        c1.assignProfessor(p1);
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);

        c2.enrollStudent(s1);

        c1.showDetails();
        s1.viewCourses();
    }
}

