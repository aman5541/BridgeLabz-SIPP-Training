class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    void display() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}
public class UniversityApp {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kiran", "A");
        Student s2 = new Student(2, "Priya", "B");
        s1.display();
        s2.display();
        Student.displayTotalStudents();
    }
}
