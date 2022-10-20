package Homework3;

/*
• Прочитать с консоли год и вывести в консоль, является он
високосным или нет
• Старайтесь использовать логические связки, если это
возможно
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какой-либо год:");
        int year = scanner.nextInt();

        if (year < 1) {
            System.out.println("Год не может быть отрицательным или равным нулю");
            return;
        }
        if (year % 4 == 0) {
            System.out.println("Данный год является високосным");
        } else {
            System.out.println("Данный год не является високосным");
        }
    }
}