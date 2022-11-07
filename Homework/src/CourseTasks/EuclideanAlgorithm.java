package CourseTasks;

/*
• Для нахождения наибольшего общего делителя двух чисел
удобно использовать алгоритм Евклида:

• Реализовать вычисление НОД алгоритмом Евклида
• Использовать цикл
• При этом если оба числа равны 0, то НОД искать нельзя
• Просьба реализовывать именно этот алгоритм, а не другой
 */

import java.util.Scanner;

public class EuclideanAlgorithm {
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

        int greatestCommonDivisor;

        if (number2 == 0) {
            greatestCommonDivisor = number1;
        } else {
            while (number1 % number2 != 0) {
                int temp = number2;
                number2 = number1 % number2;
                number1 = temp;
            }

            greatestCommonDivisor = number2;
        }

        System.out.println("Наибольший общий делитель двух введенных чисел равен: " + greatestCommonDivisor);
    }
}