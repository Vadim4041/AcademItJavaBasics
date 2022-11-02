package Homework5;

/*
• Прочитать с консоли целое число
• Найти и распечатать все простые числа, не превышающие
введенное число
 */

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i <= inputNumber; i++) {
            int dividersCount = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dividersCount++;
                }
            }

            if (dividersCount == 2) {
                System.out.println(i);
            }
        }
    }
}
