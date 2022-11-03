package Homework4;

/*
• Сложная версия задачи:
• Выводить числа ровно, чтобы они были друг под
другом. Использовать System.out.printf
• Возможность задать начальное и конечное число, и по
сколько чисел в строке выводить
 */

import java.util.Scanner;

public class NumbersInLineHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число:");
        int startNumber = scanner.nextInt();

        System.out.println("Введите конечное число:");
        int endNumber = scanner.nextInt();

        System.out.println("Введите количество чисел в строке:");
        int numbersQuantityPerLine = scanner.nextInt();

        if (startNumber > endNumber) {
            System.out.println("Конечное число меньше начального. Попробуйте снова");
            return;
        }

        int i = 1;
        int neededLength = 1;

        while (endNumber / i > 0) {
            ++neededLength;
            i *= 10;
        }

        i = startNumber;

        while (i <= endNumber) {
            System.out.printf("%" + neededLength + "d", i);

            if (i % numbersQuantityPerLine == 0) {
                System.out.println();
            }

            i++;
        }
    }
}