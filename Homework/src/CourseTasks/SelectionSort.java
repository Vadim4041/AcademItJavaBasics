package CourseTasks;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
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
    }
}