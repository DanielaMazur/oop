package com.oop.lab6;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    public String id;
    public String FullName;
    public Gender gender;
    public Date birthDate;
    public int age;
    public Date accepted;
    public ArrayList<String> sickness;
    public ArrayList<String> prescriptions;
    public ArrayList<String> allergies;
    public ArrayList<String> specialReqs;
    public ArrayList<Operations_Staff> operations_staffs;
}
