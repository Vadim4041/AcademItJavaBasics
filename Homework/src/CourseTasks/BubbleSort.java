package CourseTasks;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            boolean isNotSwitched = true;

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isNotSwitched = false;
                }
            }

            if (isNotSwitched) {
                return;
            }
        }
    }
}