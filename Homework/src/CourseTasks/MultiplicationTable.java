package CourseTasks;

/*
• Вывести в консоль таблицу умножения чисел от 1 до 10 при
помощи циклов for
• Но программа должна работать верно и если попросят таблицу
от 1 до другого числа
• Примерно так, только без границ клеток, консоль этого не
позволяет
• Добейтесь чтобы числа
были выровнены по
столбцам (добейте
числа нужным количеством
пробелов)
• Добавьте «шапку» таблицы,
отделите ее символами,
например, | и --
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, до которого будет строиться таблица умножения:");
        int lastNumber = scanner.nextInt();

        System.out.printf("Таблица умножения от 1 до %d:%n", lastNumber);

        int neededLength = 2;

        for (int i = 1; lastNumber / i != 0; i *= 10) {
            neededLength++;
        }

        String formatString = "%" + neededLength + "s";

        for (int i = 1; i <= lastNumber; i++) {

            if (i == 1) {
                System.out.printf(formatString + "|", i);
            }

            System.out.printf(formatString, i);

        }

        System.out.println();

        int horizontalLineNeededLength = (lastNumber + 1) * neededLength;

        for (int i = 0; i <= horizontalLineNeededLength; i++) {
            System.out.print("-");
        }

        System.out.println();

        String firstColumnFormatString = "%" + neededLength + "s|";

        for (int i = 1; i <= lastNumber; i++) {
            for (int j = 1; j <= lastNumber; j++) {
                if (j == 1) {
                    System.out.printf(firstColumnFormatString, i * j);
                }

                System.out.printf(formatString, i * j);
            }

            System.out.println();
        }
    }
}