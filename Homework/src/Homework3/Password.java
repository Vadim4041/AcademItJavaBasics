package Homework3;

/*
В программе объявить строковую переменную, хранящую
пароль
• С консоли прочитать строку, сравнить её с этим паролем.
Если строка совпала (проверять при помощи equals), то
выдать сообщение, что пароль верный
• Если строка не совпала с паролем, и её длина
(использовать length) больше длины пароля, то сказать что
пароль неверный и строка слишком длинная
• Если строка не совпала с паролем, и её длина меньше, то
сказать, что пароль неверный строка слишком короткая
• Иначе сказать, что пароль неверный
 */

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "qwerty123";

        System.out.println("Введите пароль:");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(password)) {
            System.out.println("Вы ввели верный пароль!");
        } else if (inputPassword.length() > password.length()) {
            System.out.println("Неверный пароль и слишком длинный");
        } else if (inputPassword.length() < password.length()) {
            System.out.println("Неверный пароль и слишком короткий");
        } else {
            System.out.println("Неверный пароль");
        }
    }
}