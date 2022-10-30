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

        while (number1 + i <= number2) {
            sum += number1 + i;
            i++;
        }

        System.out.println("Среднее арифметическое диапазона чисел равно: " + ((double) sum / i));

        if (number1 % 2 == 1) {
            number1++;
        }

        sum = 0;
        i = 0;
        int count = 0;

        while (number1 + i * 2 <= number2) {
            sum += number1 + i * 2;
            i++;
        }

        System.out.println("Среднее арифметическое четных чисел диапазона равно: " + (sum / i));
    }
}