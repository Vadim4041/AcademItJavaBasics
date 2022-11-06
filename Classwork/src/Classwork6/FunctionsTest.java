package Classwork6;

/*
• Написать функцию, которая принимает вещественные
числа x и y, и вычисляет 3x + 4y
• Вызвать ее из main несколько раз с разными аргументами
• Написать функцию, вычисляющую среднее арифметическое
целых чисел от begin до end включительно
• Вызвать ее из main
• Написать функции для вычисления минимума и максимума
из двух целых чисел
• Вызвать функции из main
 */

public class FunctionsTest {
    public static void main(String[] args) {
        System.out.println("3х_1 * 4y_1 = " + get3xPlus4y(3, 5));
        System.out.println("3х_2 * 4y_2 = " + get3xPlus4y(5, 8));
        System.out.println("3х_3 * 4y_3 = " + get3xPlus4y(10, 12));

        System.out.println("Среднее чисел от 1 до 5 = " + getAverage(1, 5));
        System.out.println("Среднее чисел от 1 до 10 = " + getAverage(1, 10));

        System.out.println("Максимальное из чисел 1 и 5 = " + getMaxNumber(1, 5));
        System.out.println("Минимальное из чисел 1 и 5 = " + getMinNumber(1, 5));
    }

    public static double get3xPlus4y(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage(int begin, int end) {
        int sum = 0;
        int count = end - begin + 1;

        for (int i = begin; i <= end; i++) {
            sum += i;
        }

        return (double) sum / count;
    }

    public static int getMaxNumber(int number1, int number2) {
        if (number2 > number1) {
            return number2;
        }

        return number1;
    }

    public static int getMinNumber(int number1, int number2) {
        return (number1 < number2) ? number1 : number2;
    }
}