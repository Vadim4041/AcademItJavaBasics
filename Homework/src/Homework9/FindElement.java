package Homework9;

/*
• Написать функцию, которая ищет указанное число в
массиве, и если находит его, то выдает его индекс. А если
не находит, то выдает -1
 */

public class FindElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 10, 5, 6};

        System.out.println(getElementIndex(array, 10));
    }

    public static int getElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
