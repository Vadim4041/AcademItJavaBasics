package Homework9;

/*
• Написать функцию, которая ищет максимальное число в
массиве вещественных чисел
 */

public class FindMax {
    public static void main(String[] args) {
        double[] array = {1.5, 2.8, 10.2, 5.2, 6.3};

        System.out.println(getMaxInArray(array));
    }

    public static double getMaxInArray(double[] array) {
        double max = array[0];

        for (double e : array) {
            if (max < e) {
                max = e;
            }
        }

        return max;
    }
}
