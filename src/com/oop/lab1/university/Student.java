package com.oop.lab1.university;

public class Student{
    String name;
    int age;
    private float mark;

    public Student(String studentName, int studentAge){
        name = studentName;
        age = studentAge;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public float getMark() {
        return mark;
    }
}

