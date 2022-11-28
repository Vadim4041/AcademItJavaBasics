package Homework12;

/*
• Разбить строку “1, 2, 3, 4, 5” и получить массив из
этих чисел и найти их сумму
• Использовать split и Integer.parseInt
 */

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";

        String[] numberStrings = numbersLine.split(", ");

        int sum = 0;
        int numberStringsLength = numberStrings.length;
        int[] numberIntegers = new int[numberStringsLength];

        for (int i = 0; i < numberStringsLength; i++) {
            numberIntegers[i] = Integer.parseInt(numberStrings[i]);
            sum += numberIntegers[i];
        }

        System.out.printf("Сумма чисел массива %s равна: %d%n", Arrays.toString(numberIntegers), sum);
    }
}
