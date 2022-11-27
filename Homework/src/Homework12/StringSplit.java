package Homework12;

/*
• Разбить строку “1, 2, 3, 4, 5” и получить массив из
этих чисел и найти их сумму
• Использовать split и Integer.parseInt
 */

public class StringSplit {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";

        String[] numberStrings = numbersLine.split(", ");

        int sum = 0;

        for (String e : numberStrings) {
            sum += Integer.parseInt(e);
        }

        System.out.println("Сумма чисел массива равна: " + sum);
    }
}
