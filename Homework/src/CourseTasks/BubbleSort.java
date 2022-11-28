package CourseTasks;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            boolean isSwitched = false;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isSwitched = true;
                }
            }

            if (!isSwitched) {
                return;
            }
        }
    }
}