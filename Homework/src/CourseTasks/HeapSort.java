package CourseTasks;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 14, 16, 1, 33, 52, 7};

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Функция "просеивания" через кучу - формирование кучи
    public static void siftDown(int[] numbers, int root, int bottom) {
        int maxChildIndex; // индекс максимального потомка
        // Пока не дошли до последнего ряда
        while (root * 2 <= bottom) {
            if (root * 2 == bottom) {   // если мы в последнем ряду,
                maxChildIndex = root * 2;
            }   // запоминаем левый потомок
            // иначе запоминаем больший потомок из двух
            else if (numbers[root * 2] > numbers[root * 2 + 1]) {
                maxChildIndex = root * 2;
            } else {
                maxChildIndex = root * 2 + 1;
            }
            // если элемент вершины не меньше максимального потомка
            if (numbers[root] >= numbers[maxChildIndex]) {
                // пирамида сформирована
                return;
            }

            int temp = numbers[root]; // меняем их местами
            numbers[root] = numbers[maxChildIndex];
            numbers[maxChildIndex] = temp;
            root = maxChildIndex;
        }
    }

    // Функция сортировки на куче
    public static void heapSort(int[] numbers) {
        int arraySize = numbers.length;
        // Формируем нижний ряд пирамиды
        for (int i = (arraySize / 2); i >= 0; i--) {
            siftDown(numbers, i, arraySize - 1);
        }
        // Просеиваем через пирамиду остальные элементы
        for (int i = arraySize - 1; i >= 1; i--) {
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;
            siftDown(numbers, 0, i - 1);
        }
    }
}
