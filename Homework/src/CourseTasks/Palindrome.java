package CourseTasks;

/*
• Объявить некоторую строковую переменную в программе
• Проверить, что данная строка является палиндромом – то
есть читается одинаково слева направо и справа налево.
• При проверке не учитывать регистр символов, учитывать
только буквы
• Пример палиндрома: «Аргентина манит негра»
• Требование: сделать без создания новой строки и без
удаления символов из строки
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string = scanner.nextLine();

        if (isPalindrome(string)) {
            System.out.println("Данная строка является палиндромом");
        } else {
            System.out.println("Данная строка не является палиндромом");
        }
    }

    public static boolean isPalindrome(String string) {
        if (string.length() == 0) {
            return false;
        }

        int leftOffset = 0;
        int rightOffset = 0;

        for (int i = 0; i < string.length() - rightOffset + leftOffset; i++) {
            char leftLetter = Character.toLowerCase(string.charAt(i + leftOffset));
            char rightLetter = Character.toLowerCase(string.charAt(string.length() - 1 - i - rightOffset));

            if (Character.isWhitespace(rightLetter) & Character.isWhitespace(leftLetter)) {
                continue;
            }

            if (Character.isWhitespace(rightLetter)) {
                leftOffset--;
                continue;
            }

            if (Character.isWhitespace(leftLetter)) {
                rightOffset--;
                continue;
            }

            leftLetter = Character.toLowerCase(string.charAt(i + leftOffset));
            rightLetter = Character.toLowerCase(string.charAt(string.length() - 1 - i - rightOffset));

            if (leftLetter != rightLetter) {
                return false;
            }
        }

        return true;
    }
}