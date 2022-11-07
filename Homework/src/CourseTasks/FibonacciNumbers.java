package CourseTasks;

/*
• Написать программу, которая принимает с консоли
целое число n и возвращает число Фибоначчи с
номером n.
• Числа Фибоначчи задаются следующим образом:
• f o = 0, f 1 = 1, f n = f n-1  + f n-2
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 */

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначчи:");
        int fibonacciNumberIndex = scanner.nextInt();

        if (fibonacciNumberIndex < 0) {
            System.out.println("Номер числа не может быть отрицательным. Попробуйте еще раз");
            return;
        }

        if (fibonacciNumberIndex == 0) {
            System.out.println("Число Фибоначчи с заданным номером равно: 0");
            return;
        }

        if (fibonacciNumberIndex == 1) {
            System.out.println("Число Фибоначчи с заданным номером равно: 1");
            return;
        }

        int i = 2;
        int previousFibonacciNumber = 0;
        int currentFibonacciNumber = 1;

        while (i <= fibonacciNumberIndex) {
            int nextFibonacciNumber = previousFibonacciNumber + currentFibonacciNumber;
            previousFibonacciNumber = currentFibonacciNumber;
            currentFibonacciNumber = nextFibonacciNumber;
            ++i;
        }

        System.out.println("Число Фибоначчи с заданным номером равно: " + currentFibonacciNumber);
    }
}