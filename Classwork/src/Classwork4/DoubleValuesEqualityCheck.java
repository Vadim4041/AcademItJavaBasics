package Classwork4;

/*
• Прочитать два вещественных числа с консоли
• Проверить, что они равны с учетом погрешности
• Выдать соответствующее сообщение
 */

import java.util.Scanner;

public class DoubleValuesEqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double epsilon = 1.0e-10;

        System.out.println("Введите первое вещественное число:");
        double a = scanner.nextDouble();

        System.out.println("Введите первое вещественное число:");
        double b = scanner.nextDouble();

        if (Math.abs(a - b) < epsilon) {
            System.out.println("Два введенных числа равны");
        } else {
            System.out.println("Две введенных числа не равны");
        }
    }
}