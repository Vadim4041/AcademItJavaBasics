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
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число диапазона:");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Два введенных числа одинаковы. Попробуйте снова");
            return;
        }

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int sum = 0;
        int i = 0;

        do {
            sum += number1 + i;
            i++;
        }
        while (number1 + i <= number2);

        System.out.println("Среднее арифметическое диапазона чисел равно: " + ((double) sum / i));

        if (number1 % 2 == 1) {
            number1++;
        }

        sum = 0;
        i = 0;
        int count = 0;

        do {
            sum += number1 + i * 2;
            i++;
        }
        while (number1 + i * 2 <= number2);

        System.out.println("Среднее арифметическое четных чисел диапазона равно: " + (sum / i));
    }
}