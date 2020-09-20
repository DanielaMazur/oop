package com.oop.lab1.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    int foundationYear;
    private List<Student> students = new ArrayList<>();

    public University(String universityName, int universityFoundationYear){
        name = universityName;
        foundationYear = universityFoundationYear;
    }

    public void setStudent(Student student){
        students.add(student);
    }

    public float computeAverageMedia(){
        float sumOfGrades = 0;

        for (Student student : students) {
            sumOfGrades += student.getMark();
        }

        return sumOfGrades / students.size();
    }
}
