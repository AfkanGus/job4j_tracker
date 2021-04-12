package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Afkan Salman ");
        student.setGr("Java beginner");
        student.setDate("23.10.2020");
        System.out.println("student"
                + "-"
                + student.getFio()
                + ","
                + " groupe "
                + student.getGr()
                + ","
                +
                "  receipt date "
                + " - "
                + student.getDate());

    }
}
