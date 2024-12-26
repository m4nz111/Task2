package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private int teacherId;
    private List<Course> assignedCourses;

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setTeacher(this);
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void printAssignedCourses() {
        System.out.println("Преподаватель " + name + " ведет курсы:");
        for (Course course : assignedCourses) {
            System.out.println("- " + course.getName());
        }
    }
}