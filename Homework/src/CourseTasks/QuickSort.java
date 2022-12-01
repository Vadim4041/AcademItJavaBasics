package CourseTasks;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {158, 100, 55, 99, 58, 101};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }

        int x = array[left];
        int i = left;
        int j = right;

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
