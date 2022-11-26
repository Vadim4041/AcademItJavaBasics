package CourseTasks;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int left, int right) {
        if (array.length <= 1) {
            return;
        }

        if (left >= right) {
            return;
        }

        int x = array[left];

        int i = left, j = right;

        if (j - i == 1) {
            if (array[i] > array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                return;
            }

            return;
        }

        while (i <= j) {
            while (array[i] < x) {
                i++;
            }

            while (array[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            sort(array, left, j);
        }

        if (right > i) {
            sort(array, i, right);
        }
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
