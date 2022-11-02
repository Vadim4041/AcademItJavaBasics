package Classwork5;

/*
• Распечатать числа от 0 до 100, кроме числа 5,
кроме всех чисел, кратных 3 и кроме чисел из
диапазона от 60 до 80 включительно
• * Сделать версию с одним if’ом
• * Переписать при помощи while
 */

public class ContinuePractice {
    public static void main(String[] args) {
        //Первый вариант:
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                continue;
            }

            if (i % 3 == 0) {
                continue;
            }

            if (i >= 60 && i <= 80) {
                continue;
            }

            System.out.println(i);
        }

        //Второй вариант:
        for (int i = 0; i <= 100; i++) {
            if ((i == 5) || (i % 3 == 0) || (i >= 60 && i <= 80)) {
                continue;
            }

            System.out.println(i);
        }

        //Третий вариант:
        int i = 0;

        while (i <= 100) {
            if ((i == 5) || (i % 3 == 0) || (i >= 60 && i <= 80)) {
                ++i;
                continue;
            }

            System.out.println(i);
            ++i;
        }
    }
}
