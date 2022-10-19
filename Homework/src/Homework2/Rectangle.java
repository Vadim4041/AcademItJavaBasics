package Homework2;

/*
• Написать программу, читающую с консоли длину и ширину
прямоугольника, и печатающую его площадь
• * Посчитайте и периметр
• Считать, что длина и ширина – вещественные числа
• В задаче про площадь прямоугольника вывести длину,
ширину и площадь прямоугольника при помощи одного
printf
• * Вывести там же и периметр
 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника:");

        double width = scanner.nextDouble();

        System.out.println("Введите длину прямоугольника:");

        double length = scanner.nextDouble();

        double perimeter = 2 * (width + length);
        double area = width * length;

        System.out.printf("Введен прямоугольник шириной %.2f и длиной %.2f. " +
                "Периметр такого прямоугольника равен %.2f, а площадь равна %.2f.", width, length, perimeter, area);
    }
}
