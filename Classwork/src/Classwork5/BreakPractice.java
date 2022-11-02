package Classwork5;

/*
• Реализовать цикл for, который печатает числа от 1
до 100, и завершается если текущее число больше
либо равно 30
 */

public class BreakPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i >= 30) {
                break;
            }

            System.out.println(i);
        }
    }
}