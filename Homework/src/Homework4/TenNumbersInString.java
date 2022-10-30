package Homework4;

/*
• Распечатать числа от 1 до 100 при помощи цикла while, но
выводить по 10 чисел в строке, дальше делать перевод
строки
• 1   2   3    4   5   6    7   8   9 10
11 12 13 14 15 16 17 18 19 20
…
 */

public class TenNumbersInString {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
