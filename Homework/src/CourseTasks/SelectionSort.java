package CourseTasks;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {78, 22, 100, 45, 99, 55};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            int minNumber = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minNumber) {
                    minIndex = j;
                    minNumber = array[j];
                }
            }

            array[minIndex] = array[i];
            array[i] = minNumber;
        }
    }
}