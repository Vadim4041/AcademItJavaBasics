package Homework10;

/*
• Написать рекурсивную функцию возведения целого числа в
целую неотрицательную степень (упрощенный аналог
Math.pow)
• Нельзя использовать Math.pow
• Когда закончите – напишите тут же нерекурсивную
функцию
 */

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(getNumberInPowerRecursive(2, 5));
        System.out.println(getNumberInPower(2, 5));
    }

    public static int getNumberInPowerRecursive(int base, int power) {
        if (power == 0) {
            return 1;
        }

        return getNumberInPowerRecursive(base, power - 1) * base;
    }

    public static int getNumberInPower(int base, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        return result;
    }
}