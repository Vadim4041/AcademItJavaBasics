package Classwork3;

import java.util.Scanner;

public class IfPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число - положительное");
        } else if (number == 0) {
            System.out.println("Данное число - ноль");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
