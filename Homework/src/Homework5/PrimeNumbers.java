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

        if (inputNumber <= 1) {
            System.out.println("Нет простых чисел, не превышающих введенное. Попробуйте еще раз");
            return;
        }

        System.out.println("Простые числа, не превышающие данное число:");

        for (int i = 2; i <= inputNumber; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
    }
}