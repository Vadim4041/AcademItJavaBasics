package CourseTasks;

/*
• Написать функцию, которая ищет в строке подстроку
максимальной длины, состоящую из одного и того же
символа, и выдает эту максимальную длину
• Например, есть строка "аааббдеггггв", должно выдаться
число 4, потому что есть 4 подряд символа «г», и это
максимальная подстрока, где подряд идет один и тот же
символ
• Функция должна работать без учета регистра
 */

import java.util.Scanner;

public class MaxSubstringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string = scanner.nextLine();

        System.out.println("Длина максимальной по длине подсктроки в веденной строке: " + findMaxSubstringLength(string));

    }

    public static int findMaxSubstringLength(String string) {
        int previousSubstringLength = 1;
        int currentSubstringLength = 1;
        int maxSubstringLength = 1;

        for (int i = 1; i < string.length(); i++) {
            char previousCharacter = string.charAt(i - 1);
            char currentCharacter = string.charAt(i);

            if (currentCharacter == previousCharacter) {
                currentSubstringLength++;
            } else {
                maxSubstringLength = Math.max(maxSubstringLength, Math.max(currentSubstringLength, previousSubstringLength));
                previousSubstringLength = currentSubstringLength;
                currentSubstringLength = 1;
            }
        }

        return maxSubstringLength;
    }
}