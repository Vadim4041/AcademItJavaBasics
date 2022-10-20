package Homework3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        int maxNumberIf;
        int minNumberIf;

        if (number1 > number2) {
            maxNumberIf = number1;
            minNumberIf = number2;
        } else {
            maxNumberIf = number2;
            minNumberIf = number1;
        }

        int maxNumberTernary = (number1 > number2) ? number1 : number2;
        int minNumberTernary = (number1 < number2) ? number1 : number2;

        System.out.println("Минимальное число из введенных: " + minNumberIf);
        System.out.println("Максимальное число из введенных: " + maxNumberIf);
    }
}
