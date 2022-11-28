package CourseTasks;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {22, 45, 55, 78, 99, 100};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSwitched = false;
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    isSwitched = true;
                }
            }

            if (!isSwitched) {
                return;
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}