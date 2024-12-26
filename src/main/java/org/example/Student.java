package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> enrolledCourses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void printEnrolledCourses() {
        System.out.println("Студент " + name + " записан на курсы:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getName());
        }
    }
}