package CourseTasks;

import java.util.Arrays;

public class HeapSortRecursive {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 14, 16, 1, 33, 52, 7};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int arrayLength = array.length;

        // Построение кучи
        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            convertToHeap(array, arrayLength, i);

        // Один за другим извлекаем элементы из кучи
        for (int i = arrayLength - 1; i >= 0; i--) {
            // Перемещаем текущий элемент в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру convertToHeap на уменьшенной куче
            convertToHeap(array, i, 0);
        }
    }

    public static void convertToHeap(int[] array, int arrayLength, int i) {
        int parentIndex = i; // Инициализируем наибольший элемент как родитель
        int child1Index = 2 * i + 1; // ребенок1 = 2*i + 1
        int child2Index = 2 * i + 2; // ребенок2 = 2*i + 2

        // Если ребенок больше родителя
        if (child1Index < arrayLength && array[child1Index] > array[parentIndex])
            parentIndex = child1Index;

        // Если ребенок больше, чем самый большой ребенок на данный момент
        if (child2Index < arrayLength && array[child2Index] > array[parentIndex])
            parentIndex = child2Index;
        // Если самый большой ребенок не родитель
        if (parentIndex != i) {
            int temp = array[i];
            array[i] = array[parentIndex];
            array[parentIndex] = temp;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            convertToHeap(array, arrayLength, parentIndex);
        }
    }
}
