package CourseTasks;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {100, 55, 99, 22, 45, 78};

        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                } else {
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
