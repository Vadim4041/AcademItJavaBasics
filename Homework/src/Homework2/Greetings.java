package Homework2;

/*
Написать программу, которая просит ввести ваше имя, а
затем выводит в консоль приветствие. Для чтения
использовать nextLine() Scanner’а
 */

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");

        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}
