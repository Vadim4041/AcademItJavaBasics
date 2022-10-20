package Homework3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "qwerty123";

        System.out.println("Введите пароль:");
        String passwordInput = scanner.nextLine();

        if (passwordInput.equals(password)) {
            System.out.println("Вы ввели верный пароль!");
        } else if (passwordInput.length() > password.length()) {
            System.out.println("Неверный пароль и слишком длинный");
        } else if (passwordInput.length() < password.length()) {
            System.out.println("Неверный пароль и слишком короткий");
        } else {
            System.out.println("Неверный пароль");
        }
    }
}
