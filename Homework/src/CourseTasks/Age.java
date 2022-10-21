package CourseTasks;

/*
• Программа просит ввести пользователя свой возраст от 1
до 112 включительно, после чего выводит сообщение
«Вам x лет»
• При этом учесть, что для разных чисел разные склонения
• Например, «3 года», «99 лет» и т.д.
• Если введут слишком малое или слишком большое число,
то выведите, что «Вы слишком малы» или стары
• Старайтесь использовать логические связки, если это
возможно
 */

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст (от 1 до 112 лет включительно):");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
            return;
        }

        if (age > 112) {
            System.out.println("Вы слишком стары");
            return;
        }

        int lastDigit = age % 10;
        int last2Digits = age % 100;

        if ((last2Digits >= 11 && last2Digits <= 14) || lastDigit == 0 || lastDigit >= 5) {
            System.out.printf("Вам %d лет", age);
        } else if (lastDigit == 1) {
            System.out.printf("Вам %d год", age);
        } else {
            System.out.printf("Вам %d года", age);
        }
    }
}
