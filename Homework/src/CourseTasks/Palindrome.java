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

        if (string.length() == 0) {
            System.out.println("Строка пустая. Попробуйте еще раз");
            return;
        }

        int whitespacesCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                whitespacesCount++;
            }
        }

        if (whitespacesCount == string.length()) {
            System.out.println("Строка состоит только из пробелов. Попробуйте еще раз");
            return;
        }

        if (isPalindrome(string)) {
            System.out.println("Данная строка является палиндромом");
        } else {
            System.out.println("Данная строка не является палиндромом");
        }
    }

    public static boolean isPalindrome(String string) {
        int leftWhitespacesCount = 0;
        int rightWhitespacesCount = 0;

        for (int i = 0; i < string.length() / 2; i++) {
            while (Character.isWhitespace(string.charAt(i + leftWhitespacesCount))) {
                leftWhitespacesCount++;
            }

            while (Character.isWhitespace(string.charAt(string.length() - 1 - i - rightWhitespacesCount))) {
                rightWhitespacesCount++;
            }

            char leftLetter = Character.toLowerCase(string.charAt(i + leftWhitespacesCount));
            char rightLetter = Character.toLowerCase(string.charAt(string.length() - 1 - i - rightWhitespacesCount));

            if (leftLetter != rightLetter) {
                return false;
            }
        }

        return true;
    }
}