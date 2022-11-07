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
        double celsiusTemperature = scanner.nextDouble();

        System.out.printf("Введенная температура по шкале Цельсия равна температуре %.02f градусов по шкале Фаренгейта%n",
                convertCelsiusToFahrenheit(celsiusTemperature));

        System.out.printf("Введенная температура по шкале Цельсия равна температуре %.02f градусов по шкале Кельвина%n",
                convertCelsiusToKelvin(celsiusTemperature));
    }

    public static double convertCelsiusToFahrenheit(double celsiusTemperature) {
        return 9.0 / 5 * celsiusTemperature + 32;
    }

    public static double convertCelsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
