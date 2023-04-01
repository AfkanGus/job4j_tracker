package ru.job4j.oop;

/**
 *  нас в программе не устраивает текущая реализация метода fly(),
 *  и мы хотим его изменить.
 */
public class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("Попугай пролетает над лужайкой");
    }
}
