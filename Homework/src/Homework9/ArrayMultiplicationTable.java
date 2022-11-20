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

        for (int[] row : multiplicationTable) {
            for (int multiplicationResult : row) {
                System.out.print(multiplicationResult + " ");
            }

            System.out.println();
        }
    }

    public static int[][] createMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }
}