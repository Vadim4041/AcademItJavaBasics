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
        int numberQuantity = scanner.nextInt();

        int i = 0;
        int sum = 1;
        int signChanger = -1;
        int nextNumber = 1;

        while (i + 1 < numberQuantity) {
            nextNumber += ((i + 2) * 2 - 1);
            sum += nextNumber * signChanger;
            signChanger *= -1;
            i++;
        }

        System.out.println("Сумма ряда равна: " + sum);
    }
}
