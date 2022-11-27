package Classwork12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("Classwork/src/Classwork12/input.txt"))) {
            int numbersCount = scanner.nextInt();

            double[] numbers = new double[numbersCount];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextDouble();
            }

            System.out.println(Arrays.toString(numbers));
        }
    }
}
