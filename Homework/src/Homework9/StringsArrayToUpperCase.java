package Homework9;

/*
• Написать функцию, которая принимает массив строк и
изменяет его, присваивая элементам эти же строки, но в
которых все символы заглавные
• Для этого использовать метод класса String toUpperCase()
• Пример вызова toUpperCase для строки:
String s = “hello”;
String b = s.toUpperCase();  // “HELLO”
 */

import java.util.Arrays;

public class StringsArrayToUpperCase {
    public static void main(String[] args) {
        String[] array = {"s", "sq", "ghj", "vdd", "sdf"};

        convertToUpperCase(array);

        System.out.println(Arrays.toString(array));
    }

    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}