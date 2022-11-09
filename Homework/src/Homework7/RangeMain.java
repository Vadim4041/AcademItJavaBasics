package Homework7;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RangeClass range = new RangeClass(10, 30);

        System.out.println("Введите начальное значение диапазона:");
        range.setFrom(scanner.nextDouble());
        System.out.println("Начальное значение диапазона: " + range.getFrom());

        System.out.println("Введите конечное значение диапазона:");
        range.setTo(scanner.nextDouble());
        System.out.println("Начальное конечное диапазона: " + range.getTo());

        System.out.println("Длина диапазона: " + range.getRange());

        System.out.println("Введите число для проверки вхождения в заданный диапазон:");

        if (range.isInside(scanner.nextDouble())) {
            System.out.println("Число входит в диапазон");
        } else {
            System.out.println("Число не входит в диапазон");
        }
    }
}
