package Homework4;

/*
• Сделать задачу про среднее арифметическое с
циклом do-while
• Эту задачу нужно присылать в одну цепочку писем
с версией с while
 */

import java.util.Scanner;

public class AverageDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число диапазона:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число диапазона:");
        int lastNumber = scanner.nextInt();

        if (firstNumber == lastNumber) {
            System.out.println("Два введенных числа одинаковы. Попробуйте снова");
            return;
        }

        if (firstNumber > lastNumber) {
            int temp = firstNumber;
            firstNumber = lastNumber;
            lastNumber = temp;
        }

        int sum = 0;
        int count = 0;
        int i = firstNumber;

        do {
            sum += i;
            count++;
            i++;
        } while (i <= lastNumber);

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое диапазона чисел равно: " + average);

        int evenNumbersSum = 0;
        int evenNumbersCount = 0;
        i = firstNumber;

        do {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            i++;
        } while (i <= lastNumber);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел диапазона равно: " + evenNumbersAverage);
    }
}