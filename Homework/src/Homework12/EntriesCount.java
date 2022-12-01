package Homework12;

/*
• Прочитать текст из файла, и написать функцию, которая
считает количество вхождений некоторой строки в этот
текст без учета регистра символов
• Использовать цикл и indexOf, который принимает
начальный индекс, с которого искать
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesCount {
    public static void main(String[] args) throws FileNotFoundException {
        int entriesCount = 0;

        try (Scanner scanner = new Scanner(new FileInputStream("Homework/src/Homework12/EntriesCountInput.txt"))) {
            while (scanner.hasNextLine()) {
                entriesCount += countSubstringsPerLine(scanner.nextLine(), "abc");
            }
        }

        System.out.println("Количество вхождений заданной строки в файле равно: " + entriesCount);
    }

    public static int countSubstringsPerLine(String string, String substring) {
        String stringInLowerCase = string.toLowerCase();
        String substringInLowerCase = substring.toLowerCase();
        int count = 0;
        int startFrom = 0;
        int substringIndex = stringInLowerCase.indexOf(substringInLowerCase, startFrom);
        int substringLength = substringInLowerCase.length();

        while (substringIndex != -1) {
            count++;
            startFrom = substringIndex + substringLength;
            substringIndex = stringInLowerCase.indexOf(substringInLowerCase, startFrom);
        }

        return count;
    }
}
