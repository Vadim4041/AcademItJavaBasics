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
        int leftCharacterIndex = 0;
        int rightCharacterIndex = string.length() - 1;

        if (rightCharacterIndex == 0) {
            return true;
        }

        for (int i = 0; i < string.length(); i++, leftCharacterIndex++, rightCharacterIndex--) {
            while (leftCharacterIndex < rightCharacterIndex && !Character.isLetter(string.charAt(leftCharacterIndex))) {
                leftCharacterIndex++;
            }

            while (rightCharacterIndex > leftCharacterIndex && !Character.isLetter(string.charAt(rightCharacterIndex))) {
                rightCharacterIndex--;
            }

            if (leftCharacterIndex >= rightCharacterIndex) {
                return true;
            }

            if (Character.toLowerCase(string.charAt(leftCharacterIndex)) != Character.toLowerCase(string.charAt(rightCharacterIndex))) {
                return false;
            }
        }
        return true;
    }
}