package Homework4;

/*
• Сложная версия задачи:
• Выводить числа ровно, чтобы они были друг под
другом. Использовать System.out.printf
• Возможность задать начальное и конечное число, и по
сколько чисел в строке выводить
 */

import java.util.Scanner;

public class NumbersInStringHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число:");
        int start = scanner.nextInt();

        System.out.println("Введите конечное число:");
        int end = scanner.nextInt();

        System.out.println("Введите число чисел в строке:");
        int numbersPerString = scanner.nextInt();

        if (start > end) {
            System.out.println("Конечное число меньше начального. Попробуйте снова");
            return;
        }

        int i = 1;
        int digitsQuantity = 0;

        while (end / i > 0) {
            ++digitsQuantity;
            i *= 10;
        }

        i = 0;

        while (start + i <= end) {
            System.out.printf("%" + (digitsQuantity + 1) + "d", (start + i));
            i++;

            if (i % numbersPerString == 0) {
                System.out.println();
            }
        }
    }
}
