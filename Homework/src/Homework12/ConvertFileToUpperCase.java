package Homework12;

/*
• Написать программу, которая читает строки файла,
переводит их в верхний регистр и записывает
результат во второй файл
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertFileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("Homework/src/Homework12/ConvertFileToUpperCaseInput.txt"));
             PrintWriter writer = new PrintWriter("Homework/src/Homework12/ConvertFileToUpperCaseOutput.txt")) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
