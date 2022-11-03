package Homework4;

/*
• Написать программу, которая находит результат такого
выражения:
• 1 – 4 + 9 – 16 + 25 – 36 ...
• Количество чисел в этом выражении должно быть
параметром программы
 */

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int numbersQuantity = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= numbersQuantity) {
            sum += Math.pow(i, 2) * Math.pow(-1, i + 1);
            i++;
        }

        System.out.println("Сумма ряда равна: " + sum);
    }
}