package ru.job4j.Job4.execises.Loop;

public class SectionCount {
    public static int count(int length, int section){
        int s =1;
        while (section > length){
            section = length-section;
        }
        return s;
    }
}
/*
* 9.3. Найти количество отрезков, используя цикл
Даны два целых положительных числа length, section. length -
* это расстояние. Вам нужно не используя операцию деления
*  найти сколько раз отрезок длиной section помещает в length.
*  Нужно использовать цикл while

Например,

Для length = 2, section = 1 => 2

Для length = 3, section = 2 => 1*/