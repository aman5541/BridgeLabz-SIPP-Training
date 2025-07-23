package Day1JavaGenerics;
import java.util.*;

abstract class CourseType {
    String title;
    public CourseType(String title) { this.title = title; }
    public abstract void showEvaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) { super(title); }
    public void showEvaluationMethod() { System.out.println(title + " - Exam based"); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) { super(title); }
    public void showEvaluationMethod() { System.out.println(title + " - Assignment based"); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) { super(title); }
    public void showEvaluationMethod() { System.out.println(title + " - Research based"); }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T c) { courses.add(c); }
    public List<T> getCourses() { return courses; }
}

class University {
    public static void displayAllCourses(List<? extends CourseType> list) {
        for (CourseType c : list) c.showEvaluationMethod();
    }
}

class MainUniversity {
    public static void main(String[] args) {
        Course<ExamCourse> exams = new Course<>();
        exams.addCourse(new ExamCourse("Mathematics"));
        exams.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignments = new Course<>();
        assignments.addCourse(new AssignmentCourse("Design"));

        Course<ResearchCourse> research = new Course<>();
        research.addCourse(new ResearchCourse("Quantum AI"));

        System.out.println("--- Courses Offered ---");
        University.displayAllCourses(exams.getCourses());
        University.displayAllCourses(assignments.getCourses());
        University.displayAllCourses(research.getCourses());
    }
}