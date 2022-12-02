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
        int[] integerNumbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            integerNumbers[i] = Integer.parseInt(numberStrings[i]);
            sum += integerNumbers[i];
        }

        System.out.printf("Сумма чисел массива %s равна: %d%n", Arrays.toString(integerNumbers), sum);
    }
}
