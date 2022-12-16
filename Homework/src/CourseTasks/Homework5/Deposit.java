package CourseTasks.Homework5;

/*
• Напишите программу, которая рассчитывает сумму
банковского вклада с заданной ставкой % годовых
на заданное число месяцев
• Вклад с капитализацией – считаем, что после
истечения каждого месяца к сумме вклада
прибавляется процент от суммы вклада на начало
месяца
• Также распечатать прибыль
 */

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        double initialSum = scanner.nextDouble();

        System.out.println("Введите процентную ставку в %:");
        double interestRate = scanner.nextDouble();

        System.out.println("Введите количество месяцев:");
        int monthsQuantity = scanner.nextInt();

        final int hundredPercents = 100;
        final int monthsInYearQuantity = 12;
        final double conversionToPercents = 1.0 / hundredPercents / monthsInYearQuantity;

        double monthlyIncreaseCoefficient = 1 + interestRate * conversionToPercents;

        double endSum = initialSum;

        for (int i = 0; i < monthsQuantity; i++) {
            endSum *= monthlyIncreaseCoefficient;
        }

        System.out.printf("Итоговая сумма на вкладе по истечении %d месяцев: %,.2f%n", monthsQuantity, endSum);

        double profit = endSum - initialSum;
        System.out.printf("Доходность составила: %,.2f%n", profit);
    }
}