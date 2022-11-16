package Homework9;

/*
• Найти среднее арифметическое элементов массива,
которые являются четными числами
 */

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 5, 6};

        System.out.println(getEvenNumbersAverage(array));
    }

    public static double getEvenNumbersAverage(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }
}