package com.gla;

class Faculty implements Graded {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }
    public void assignGrade(Student student, Course course, String grade) {
        System.out.println("Faculty " + name + " assigned grade " + grade + " to student " + student.getName() + " for course " + course.getTitle());
        
    }
}
