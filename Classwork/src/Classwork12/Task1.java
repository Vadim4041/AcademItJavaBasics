package Classwork12;

/*
• Создать строку из чисел от 1 до 100 через запятую
при помощи StringBuilder
• Распечатать строку в консоль
• Не называйте свой класс StringBuilder, чтобы не
было конфликтов имен со стандартным классом
 */

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

        String result = stringBuilder.toString();
        System.out.println(result);
    }
}