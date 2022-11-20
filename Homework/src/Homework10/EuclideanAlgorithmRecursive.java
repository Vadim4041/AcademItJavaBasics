package Homework10;

/*
• Задача про НОД
• Необходимо реализовать рекурсивную версию в
виде функции НОД 𝑎, 𝑏 = ቊ 𝑎, если 𝑏 = 0 НОД 𝑏, 𝑎 % 𝑏 иначе,
• где a % b – остаток от деления a на b
• Если оба числа равны 0, то НОД искать нельзя
 */

import java.util.Scanner;

public class EuclideanAlgorithmRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Оба введенных числа равны нулю. Попробуйте еще раз");
            return;
        }

        System.out.println("Наибольший общий делитель двух введенных чисел равен: " + getGreatestCommonDivisor(number1, number2));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }
}