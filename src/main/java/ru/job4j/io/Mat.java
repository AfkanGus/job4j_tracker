package ru.job4j.io;

import java.util.Scanner;

public class Mat {
    public static void main(String[] args) {
        int matches = 11;
        Scanner input = new Scanner(System.in);
        boolean playerOne = true;
        do {
            System.out.println("На столе лежат " + matches + " спичек");
            System.out.print("Игрок номер " + (playerOne ? "один" : "два") + ", ваш ход:");
            int select = Integer.parseInt(input.nextLine());
            if (select > 0 && select < 4 && matches >= select) {
                matches -= select;
                playerOne = !playerOne;
            } else {
                System.out.println("неверно введено количество, введите от 1 до 3, но не больше чем осталось");
            }
        } while (matches > 0);
        System.out.println("Игрок номер " + (!playerOne ? "один" : "два") + " выиграл");
    }
}

