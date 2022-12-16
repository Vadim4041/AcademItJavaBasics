package CourseTasks.Homework11;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 14, 16, 1, 33, 52, 7};

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Функция "просеивания" через кучу - формирование кучи
    public static void siftDown(int[] numbers, int rootIndex, int endIndex) {
        // Пока не дошли до последнего ряда
        while (rootIndex * 2 + 1 <= endIndex) {
            int child1Index = rootIndex * 2 + 1;
            int child2Index = rootIndex * 2 + 2;
            int maxChildIndex; // индекс максимального потомка

            if (child1Index == endIndex) {   // если мы в последнем ряду, запоминаем левый потомок, иначе запоминаем больший потомок из двух
                maxChildIndex = child1Index;
            } else if (numbers[child1Index] > numbers[child2Index]) {
                maxChildIndex = child1Index;
            } else {
                maxChildIndex = child2Index;
            }

            // если элемент вершины не меньше максимального потомка
            if (numbers[rootIndex] >= numbers[maxChildIndex]) {
                // пирамида сформирована
                return;
            }

            int temp = numbers[rootIndex]; // меняем их местами
            numbers[rootIndex] = numbers[maxChildIndex];
            numbers[maxChildIndex] = temp;

            rootIndex = maxChildIndex;
        }
    }

    // Функция сортировки на куче
    public static void heapSort(int[] numbers) {
        // Формируем нижний ряд пирамиды
        for (int i = numbers.length / 2 - 1; i >= 0; i--) {
            siftDown(numbers, i, numbers.length - 1);
        }

        // Просеиваем через пирамиду остальные элементы
        for (int i = numbers.length - 1; i >= 1; i--) {
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;

            siftDown(numbers, 0, i - 1);
        }
    }
}
