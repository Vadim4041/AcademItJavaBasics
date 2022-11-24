package CourseTasks;

/*
• Реализовать функцию поиска минимума в массиве
• Переделать на функцию, которая ищет индекс, по
которому лежит минимум в массиве
• Переделать, чтобы функция поиска индекса
минимума работала не по всему массиву, а только
в части массива, начинающейся с индекса start
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int minNumberIndex = j;
            int min = array[minNumberIndex];

            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < min) {
                    minNumberIndex = i;
                    min = array[minNumberIndex];
                }
            }

            int temp = array[j];
            array[j] = array[minNumberIndex];
            array[minNumberIndex] = temp;
        }

        return array;
    }
}