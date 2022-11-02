package Classwork5;

/*
• Распечатать числа, кратные четверке от 1 до 100,
причем в обратном порядке (то есть, начиная с
100). Использовать цикл for
• Распечатать квадраты чисел от 1 до n при помощи
цикла for, где n – задается в коде
• Например, при n = 4:   1, 4, 9, 16
• Решить задачу про среднее арифметическое чисел
от x до y при помощи цикла for
 */

public class NumbersPrinting2 {
    public static void main(String[] args) {
        // Первая задача:
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        // Вторая задача:
        int lastNumber = 10;

        for (int i = 1; i <= lastNumber; i++) {
            System.out.println(Math.pow(i, 2));
        }

        // Третья задача:
        int firstNumber = 1;
        int secondNumber = 6;

        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        int sum = 0;
        int count = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое чисел равно: " + average);
    }
}