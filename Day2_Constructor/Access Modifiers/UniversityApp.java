class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void display() {
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);              
        System.out.println("CGPA: " + getCGPA());
    }
}
public class UniversityApp {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Ravi", 8.7);
        pg.display();
        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
