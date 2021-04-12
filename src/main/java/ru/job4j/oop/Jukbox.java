package ru.job4j.oop;

public class Jukbox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюжу");
        }
        if (position == 2) {
            System.out.println("Спокойно ночи");
        } else if (position > 2 || position < 1) {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukbox song = new Jukbox();
        song.music(1);
        song.music(2);
        song.music(3);
        song.music(0);

    }
}
