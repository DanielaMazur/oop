package com.oop.lab6;

import java.util.ArrayList;
import java.util.Date;

enum Gender {
    FEMALE,
    MALE
}

public class Person {
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public String fullName;
    public Date birthData;
    public Gender gender;
    public String homeAddress;
    public String phone;
    public ArrayList<Hospital> hospitals;
}
