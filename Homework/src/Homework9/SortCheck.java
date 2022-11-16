package Homework9;

/*
• Написать функцию, которая проверяет, что массив
отсортирован по возрастанию
• И написать функцию, которая проверяет, что массив
отсортирован по убыванию
 */

public class SortCheck {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 3, 2};

        System.out.println(checkAscending(array));

        System.out.println(checkDescending(array));
    }

    public static boolean checkAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                return false;
            }
        }

        return true;
    }
}