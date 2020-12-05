package ru.job4j.pojo;

import java.lang.module.FindException;
import java.net.BindException;
import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        Book summer = new Book("Sun", 50);
        Book autem = new Book("Rain", 40);
        Book winter = new Book("Snow", 30);
        Book prog = new Book("Clean code", 20);

        Book[] weaher = new Book[4];
        weaher[0] = summer;
        weaher[1] = autem;
        weaher[2] = winter;
        weaher[3] = prog;
        for (int index = 0; index < weaher.length; index++) {
            Book book = weaher[index];
            System.out.println("Книга " + book.getName() + ", в ней страниц - " + book.getList());
        }
        System.out.println("Replace sun to wind.");
        weaher[0] = prog;
        weaher[3] = summer;
        for (int index = 0; index < weaher.length; index++) {
            Book book = weaher[index];
            System.out.println("Книга " + book.getName() + ", в ней страниц - " + book.getList());
        }
        System.out.println("Show only Clean code.");
        for (int index = 0; index < weaher.length; index++) {
            Book book = weaher[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getList());
            }
        }
    }
}
