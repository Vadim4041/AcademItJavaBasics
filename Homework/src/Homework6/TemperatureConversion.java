package Homework6;

/*
• Написать программу, которая переводит температуру из
градусов Цельсия в градусы Кельвина и Фаренгейта
• Прочитать число – температуру в шкале Цельсия и
напечатать две строки – в градусах Кельвина и Фаренгейта
• Перевод градусов Цельсия в градусы Кельвина и перевод в
градусы Фаренгейта оформить отдельными функциями
• Формулы найти в интернете
 */

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру по шкале Цельсия:");
        double temperatureCelsius = scanner.nextDouble();

        double temperatureFahrenheit = ConvertCelsiusToFahrenheit(temperatureCelsius);

        System.out.printf("Введенная температура по шкале Цельсия равна температуре" +
                " %.02f по шкале Фаренгейта%n", temperatureFahrenheit);

        System.out.printf("Температура по шкале Фаренгейта равна температуре" +
                " %.02f по шкале Цельсия%n", ConvertFahrenheitToCelsius(temperatureFahrenheit));
    }

    public static double ConvertCelsiusToFahrenheit(double temperatureCelsius) {
        return (double) 9 / 5 * temperatureCelsius + 32;
    }

    public static double ConvertFahrenheitToCelsius(double temperatureFahrenheit) {
        return (double) 5 / 9 * (temperatureFahrenheit - 32);
    }
}
