package Homework5;

/*
• В программе должна быть некоторая загаданная
фиксированная строка
• Далее программа предлагает пользователю ввести строку,
пользователь вводит
• Если введена та загаданная строка, то программа должна
завершаться
• Иначе пользователю дается следующая попытка для ввода
и т.д., пока не введет правильно. При этом каждый раз
пользователю должно выдаваться приглашение для ввода
• В этой задаче используйте бесконечный цикл и break
 */

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctLine = "123";

        System.out.println("Введите строку:");

        while (true) {
            String inputLine = scanner.nextLine();

            if (inputLine.equals(correctLine)) {
                break;
            }

            System.out.println("Неправильно. Попробуйте еще раз:");
        }

        System.out.println("Поздравляем! Вы ввели правильную строку: " + correctLine);
    }
}