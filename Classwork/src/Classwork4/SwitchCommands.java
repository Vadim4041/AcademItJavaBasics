package Classwork4;

/*
• Прочитать с консоли строку с названием команды
• Если ввели слово print, то прочитать с консоли еще одну
строку, и напечатать ее
• Если ввели слово sum, то прочитать с консоли два
вещественных числа, и вывести их сумму
• Если ввели что-то другое, то напечатать, что это
неизвестная команда
• Использовать классический switch (без ->), warning
игнорируем
 */

import java.util.Scanner;

public class SwitchCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду print, чтобы прочитать с консоли строку и напечатать ее," +
                " или команду sum, чтобы прочитать с консоли два вещественных числа и вывести их сумму:");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите еще одну строку:");
                String inputString = scanner.nextLine();

                System.out.println("Вы ввели следующее: " + inputString);
                break;
            case "sum":
                System.out.println("Введите первое вещественное число:");
                double number1 = scanner.nextDouble();

                System.out.println("Введите второе вещественное число:");
                double number2 = scanner.nextDouble();

                System.out.println("Сумма веденных чисел: " + (number1 + number2));
                break;
            default:
                System.out.println("Введена неизвестная команда");
        }
    }
}