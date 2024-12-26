package org.example;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void printStudents() {
        System.out.println("Группа " + name + " состоит из:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}