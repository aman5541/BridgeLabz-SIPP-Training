package com.gla;

abstract class Student {
    private String name;
    private int id;
    private double gpa;
    private String electivePreference;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.electivePreference = "None";
    }

    public Student(String name, int id, String electivePreference) {
        this.name = name;
        this.id = id;
        this.electivePreference = electivePreference;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getElectivePreference() {
        return electivePreference;
    }

    public void printDetails() {
        System.out.println( "id  :"+ id + "Student name : " + name + "GPA :" + gpa  + "ElectivePreference :" + electivePreference);
    }
}

