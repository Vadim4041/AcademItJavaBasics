package CourseTasks;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            int j = i - 1;

            for (; j >= 0; j--) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }

            array[j + 1] = temp;
        }
    }
}
