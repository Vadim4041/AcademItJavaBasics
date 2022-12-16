package CourseTasks.Homework10;

/*
1. Вычисляем средний индекс middle через left и right
2. Смотрим элемент по индексу middle. Если он равен x, то
всё, нашли
3. Если x > a[middle], то ищем в правой части, присваиваем
left = middle + 1, и на шаг 1
4. Иначе (если x < a[middle]), то ищем в левой части,
присваиваем right = middle – 1, и на шаг 1
5. Если left > right, то заканчиваем алгоритм, выдаем -1
 */

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {1, 8, 15, 22, 45, 78};

        System.out.println(binarySearch(array, 0, 5, 22));
        System.out.println(binarySearch(array, 78));
    }

    public static int binarySearch(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == x) {
            return x;
        }

        if (array[middle] < x) {
            return binarySearch(array, middle + 1, right, x);
        }

        return binarySearch(array, left, middle - 1, x);
    }

    public static int binarySearch(int[] array, int x) {
        return binarySearch(array, 0, array.length - 1, x);
    }
}
