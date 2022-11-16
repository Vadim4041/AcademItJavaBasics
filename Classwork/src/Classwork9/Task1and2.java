package Classwork9;

/*
• Написать программу, заполняющую массив длины 100
последовательными числами от 1 до 100
• После этого отдельным циклом распечатать элементы
массива
• В задаче про заполнение массива замените второй цикл на
цикл foreach
 */

public class Task1and2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int e : array) {
            System.out.println(e);
        }
    }
}
