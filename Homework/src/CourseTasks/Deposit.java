package CourseTasks;

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
        int months = scanner.nextInt();

        double endSum = initialSum;

        for (int i = 0; i < months; i++) {
            endSum += endSum * interestRate / 100 / 12;
        }

        System.out.printf("Итоговая сумма на вкладе по истечении %d месяцев: %,.2f%n", months, endSum);

        double yield = endSum - initialSum;

        System.out.printf("Доходность составила: %,.2f%n", yield);
    }
}
