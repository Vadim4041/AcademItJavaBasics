package Homework9;

/*
• Написать функцию, которая создает двумерный массив с
таблицей умножения
• Размер таблицы должен быть параметром функции
• Вызвать функцию и распечатать результат в main
 */

import java.util.Arrays;

public class ArrayMultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = createMultiplicationTable(10);

        for (int[] e : multiplicationTable) {
            System.out.println(Arrays.toString(e));
        }
    }

    public static int[][] createMultiplicationTable(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }
}