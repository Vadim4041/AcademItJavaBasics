package Homework4;

/*
• Написать программу, вычисляющую среднее
арифметическое чисел из некоторого диапазона чисел
(например, от 3 до 17)
• Концы диапазона задать переменными, начальное число
берите > 1, чтобы было посложнее
• Среднее арифметическое чисел – нужно сумму всех чисел
поделить на количество этих чисел
• В этом же классе - найти среднее арифметическое только
четных чисел из этого диапазона чисел
 */

import java.util.Scanner;

public class Average {
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

        while (i <= lastNumber) {
            sum += i;
            count++;
            i++;
        }

        double average = (double) sum / count;

        System.out.println("Среднее арифметическое диапазона чисел равно: " + average);

        int evenNumbersSum = 0;
        int evenNumbersCount = 0;
        i = firstNumber;

        while (i <= lastNumber) {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            i++;
        }

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел диапазона равно: " + evenNumbersAverage);
    }
}