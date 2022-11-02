package Classwork5;

/*
• Распечатать числа от 0 до 100 при помощи цикла
for
• Распечатать числа от 7 до 121 при помощи цикла
for
• Распечатать числа от 100 до 30 при помощи цикла
for
 */

public class NumbersPrinting {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 7; i <= 121; i++) {
            System.out.println(i);
        }

        for (int i = 100; i >= 30; i--) {
            System.out.println(i);
        }
    }
}