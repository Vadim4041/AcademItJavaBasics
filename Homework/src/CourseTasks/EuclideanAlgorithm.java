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
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("Оба введенных числа равны нулю. Попробуйте еще раз");
            return;
        }

        int greatestCommonDivisor;

        if (secondNumber == 0) {
            greatestCommonDivisor = firstNumber;
        } else {
            while (firstNumber % secondNumber != 0) {
                int temp = secondNumber;
                secondNumber = firstNumber % secondNumber;
                firstNumber = temp;
            }

            greatestCommonDivisor = secondNumber;
        }

        System.out.println("Наибольший общий делитель двух введенных чисел равен: " + greatestCommonDivisor);
    }
}