package Homework6;

/*
• Написать функцию, которая объединяет в себе две
операции: вывод пользователю приглашения для ввода в
консоль и чтение int’а с консоли
• Функция должна принимать строку и возвращать
прочитанное число
• Из функции main несколько раз вызвать данную функцию с
разными значениями аргументов
• Пример, как функция будет вызываться:
int a = printAndRead(“Введите число:”)
 */

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int number1 = printAndRead("Введите первое число:");
        int number2 = printAndRead("Введите второе число:");
        int number3 = printAndRead("Введите третье число:");
    }

    public static int printAndRead(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }
}