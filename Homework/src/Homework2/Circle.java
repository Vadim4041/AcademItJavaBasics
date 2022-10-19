package Homework2;

/*
Написать программу, которая вычисляет и печатает:
• Площадь круга и длину окружности с заданным радиусом.
Значение радиуса задать самим в тексте программы
• Посчитать радиус окружности с заданной площадью круга.
Значение площади задать самим в тексте программы
• * Посчитать площадь сектора с заданными радиусом и углом
в градусах.
Значения радиуса и угла задать в тексте программы
• Использовать класс Math: возведение в степень, квадратный
корень, константа Пи и др.
• Имена переменных должны быть хорошими, не ориентируемся
на математические обозначения
 */


public class Circle {
    public static void main(String[] args) {
        double givenCircleRadius = 5;
        double circleArea = Math.pow(givenCircleRadius, 2) * Math.PI;
        System.out.println("Площадь круга заданного радиуса равна: " + circleArea);
        double circumference = 2 * Math.PI * givenCircleRadius;
        System.out.println("Длина окружности заданного радиуса равна: " + circumference);

        double givenCircleArea = 78.53981633974483;
        double radius = Math.sqrt(givenCircleArea / Math.PI);
        System.out.println("Радиус окружности заданной площади равен: " + radius);

        double sectorAngle = 45;
        double sectorRadius = 5;
        double sectorArea = Math.toRadians(sectorAngle) * Math.pow(sectorRadius, 2) / 2;
        System.out.println("Площадь сектора круга с заданным радиусом и углом равна: " + sectorArea);
    }
}
