package CourseTasks.Homework5;

/*
• Напишите программу-игру, которая делает следующее:
• Компьютер загадывает случайное число от 1 до 100
включительно
• Для генерации случайного числа используйте класс
Random
• Далее задача пользователя – отгадать число
• Вы вводите свою догадку. Если ввели верно, то игра
завершается, и компьютер выводит за сколько попыток вы
отгадали число
• Если ввели неверно, то компьютер должен сообщить,
загаданное число больше или меньше
• Число попыток у пользователя не ограничено
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int correctNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число от 1 до 100 включительно:");
        int inputNumber = scanner.nextInt();

        int triesCount = 1;

        while (inputNumber != correctNumber) {
            if (inputNumber < correctNumber) {
                System.out.println("Вы ввели число, меньшее, чем загаданное. Попробуйте еще раз:");
            } else {
                System.out.println("Вы ввели число, большее, чем загаданное. Попробуйте еще раз:");
            }

            triesCount++;
            inputNumber = scanner.nextInt();
        }

        System.out.println("Поздравляем! Вы угадали число. Потребовалось попыток: " + triesCount);
    }
}