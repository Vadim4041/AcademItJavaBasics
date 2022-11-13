package Homework8;

/*
• Прочитать с консоли строку
• Вывести число букв в этой строке
• Вывести число цифр в этой строке
• Вывести число пробельных символов в этой строке
• Вывести число остальных символов в строке
 */

import java.util.Scanner;


public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int stringLength = string.length();

        for (int i = 0; i < stringLength; i++) {
            char c = string.charAt(i);

            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)) {
                digitsCount++;
            } else if (Character.isWhitespace(c)) {
                whitespacesCount++;
            }
        }

        System.out.println("Количество букв в веденной строке: " + lettersCount);
        System.out.println("Количество цифр в веденной строке: " + digitsCount);
        System.out.println("Количество пробельных символов в веденной строке: " + whitespacesCount);

        int otherCharactersCount = stringLength - (lettersCount + digitsCount + whitespacesCount);
        System.out.println("Количество остальных символов в веденной строке: " + otherCharactersCount);
    }
}