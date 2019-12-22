package ru.job4j.io;

import java.util.Scanner;
import java.util.SortedMap;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("Начать играть в игру \"11\"?(Y/N)");
        //String answer = input.nextLine();
        //answer = answer.toUpperCase();
        boolean ready = true;
        while (ready) {
            String answer = input.nextLine();
            answer = answer.toUpperCase();
            if (answer.equals("Y")) {
                while (matches >= 0) {
                    System.out.println("Первый игрок введите число от 1 до 3.");
                    int match = input.nextInt();
                    matches = matches - match;
                    if (matches <= 0) {
                        System.out.println("Игра окончена. Первый игрок выиграл!");
                        break;
                    }
                    System.out.println("Осталось спичек: " + matches);

                    System.out.println("Первый игрок введите число от 1 до 3.");
                    match = input.nextInt();
                    matches = matches - match;
                    if (matches <= 0) {
                        System.out.println("Игра окончена. Второй игрок выиграл!");
                        break;
                    }
                    System.out.println("Осталось спичек: " + matches);
                }
                break;
            } else if (answer.equals("N")) {
                System.out.println("Игра завершена.");
                ready = false;
            } else {
                System.out.println("Не понятный символ попробуйте ещё раз");

            }
        }
    }
}
