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

        System.out.println(isSortedInAscendingOrder(array));
        System.out.println(isSortedInDescendingOrder(array));
    }

    public static boolean isSortedInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSortedInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                return false;
            }
        }

        return true;
    }
}