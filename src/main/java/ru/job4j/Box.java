package ru.job4j;

import java.util.ArrayList;
import java.util.List;

public class Box {
    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void num(int x) {
        System.out.println("Значение типа int: " + x);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int a = 1;
        Integer b;
        b = a;
        System.out.println("b" + b);
        int x = 2;
        num(x);
        Integer m = 3;
        int n = m;
        System.out.println("int n = " + n);
    }
}
