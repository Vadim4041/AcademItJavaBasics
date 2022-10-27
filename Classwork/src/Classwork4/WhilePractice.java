package Classwork4;

/*
• Найти сумму чисел от 0 до 9
• Переделать программу, чтобы найти сумму от 3 до
21 включительно
• Переделать программу, чтобы найти сумму только
четных чисел от 3 до 21 включительно
• Дополнительно найти количество четных чисел от 3
до 21 включительно
 */

public class WhilePractice {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i <= 9) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 0 до 9 равна " + sum);

        sum = 0;
        i = 3;

        while (i <= 21) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 3 до 21 включительно: " + sum);

        sum = 0;
        i = 4;

        while (i <= 20) {
            sum += i;
            i += 2;
        }

        System.out.println("Сумма четных чисел от 3 до 21 включительно: " + sum);

        int evenNumbersQuantity = 0;
        i = 4;

        while (i <= 20) {
            ++evenNumbersQuantity;
            i += 2;
        }

        System.out.println("Количество четных чисел от 3 до 21 включительно: " + evenNumbersQuantity);
    }
}