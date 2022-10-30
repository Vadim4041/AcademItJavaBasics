package Homework4;

/*
• Прочитать с консоли целое число
• Найдите сумму его цифр
• Найдите сумму только тех цифр числа, которые являются
нечетными числами
• Найдите максимальную цифру числа
 */

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = Math.abs(scanner.nextInt());

        int i = 1;
        int digitsSum = 0;

        while (number / i > 0) {
            digitsSum += number / i % 10;
            i *= 10;
        }

        System.out.println("Сумма цифр введенного числа равна: " + digitsSum);

        int digit;
        int oddDigitsSum = 0;
        i = 1;

        while (number / i > 0) {
            digit = number / i % 10;

            if (digit % 2 == 1) {
                oddDigitsSum += digit;
            }

            i *= 10;
        }

        System.out.println("Сумма нечетных цифр введенного числа равна: " + oddDigitsSum);

        int maxDigit = 0;
        i = 1;

        while (number / i > 0) {
            digit = number / i % 10;

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            i *= 10;
        }

        System.out.println("Максимальная цифра введенного числа равна: " + maxDigit);
    }
}