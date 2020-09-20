package com.oop.lab1.university;

public class Main {


    public static void main(String[] args) {
        University UTM = new University("UTM", 1964);
        University USM = new University("USM", 1946);
        University USMF = new University("USMF", 1945);

        Student Ion = new Student("Ion", 20);
        Ion.setMark(8);

        Student Ana = new Student("Ana", 19);
        Ana.setMark(7);

        UTM.setStudent(Ion);
        UTM.setStudent(Ana);

        Student Dina = new Student("Dina", 21);
        Dina.setMark(10);

        Student Victor = new Student("Victor", 23);
        Victor.setMark(9);

        USM.setStudent(Dina);
        USM.setStudent(Victor);

        Student Denis = new Student("Denis", 22);
        Denis.setMark(7);

        Student Alina = new Student("Alina", 21);
        Alina.setMark(6);

        USMF.setStudent(Denis);
        USMF.setStudent(Alina);

        float UTM_Media = UTM.computeAverageMedia();
        float USM_Media = USM.computeAverageMedia();
        float USMF_Media = USMF.computeAverageMedia();

        float universitiesMedia = (UTM_Media + USM_Media + USMF_Media) / 3;

        System.out.println("The average media between universities is:" + universitiesMedia);
    }
}

