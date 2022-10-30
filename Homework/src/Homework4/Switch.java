package Homework4;

/*
• Прочитать с консоли три числа – два операнда и код
команды
• Код команды должен быть от 1 до 4
• Если он равен 1, то выполнить сложение первых двух чисел.
Если 2, то вычитание, если 3, то умножение, если 4, то
деление.
• Если ввели число не от 1 до 4, то вывести, что неизвестная
операция
• Использовать классический switch (без ->), warning
игнорируем
 */

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число - первый операнд:");
        double number1 = scanner.nextDouble();

        System.out.println("Введите число - второй опранд:");
        double number2 = scanner.nextDouble();

        System.out.println("Введите число - номер команды:");
        int commandNumber = scanner.nextInt();

        switch (commandNumber) {
            case 1:
                System.out.println("Сумма введенных чисел равна: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Разность введенных чисел равна: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Произведение введенных чисел равно: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Частное введенных чисел равное: " + (number1 / number2));
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}