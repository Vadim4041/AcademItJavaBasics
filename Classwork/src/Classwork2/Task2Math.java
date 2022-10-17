package Classwork2;

/*
• Написать программу, которая вычисляет и печатает
площадь круга с заданным радиусом.
• Значение радиуса задать самим в тексте программы
• Использовать класс Math: тригонометрические функции,
возведение в степень, квадратный корень, константа Пи и
др.
 */

import static java.lang.Math.*;

public class Task2Math {
    public static void main(String[] args) {
        double radius = 5;
        double area = PI * pow(radius, 2);
        System.out.println("Площадь круга заданного радиуса равна: " + area);

        double side1 = 3;
        double side2 = 4;
        double side3 = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Гипотенуза прямоугольного треугольника с заданными катетами равна: " + side3);
    }
}
