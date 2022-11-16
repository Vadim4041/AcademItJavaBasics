package Homework9;

/*
• Переставить элементы массива в обратном порядке
 */

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 5, 6};

        reverseArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
