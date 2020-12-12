package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean player = true;
        int matches = 11;
        while (matches > 0) {
            System.out.println("Твой ход, возьми спичку одну, две,или три : ");
            int select = Integer.parseInt(input.nextLine());
            if (select > 0 && select <= 3) {
                matches -= select;
                player = !player;
                System.out.println("Осталось " + matches + " спичек. ");
                System.out.print("Игрок " + (player ? " первый " : " второй "));

            } else if (select >= 3) {
                System.out.println(" Не правильно, возьмите спички от 1 до 3");
            }
            if (matches == 0) {
                System.out.println(" - победил!");
            }
        }
    }
}



