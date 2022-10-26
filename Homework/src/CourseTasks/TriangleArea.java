package CourseTasks;

/*
Прочитать с консоли координаты трёх точек на плоскости:
(x1, y1), (x2, y2), (x3, y3)
• Вычислить и вывести на экран площадь данного треугольника
• Для вычисления площади можно воспользоваться формулой Герона:
• 𝑆∆ = 𝑝(𝑝 − 𝑎)(𝑝 − 𝑏)(𝑝 − 𝑐), где  𝑝 −полупериметр треугольника  𝑝 =( 𝑎 + 𝑏 + 𝑐 )/2, 𝑎 ,  𝑏 ,  𝑐 −длины сторон треугольника
• Проверить на случай, когда эти точки лежат на одной прямой – в этом
случае вычислять площадь не нужно, а нужно вывести сообщение об
этом
• Для вычисления корня использовать команду
Math.sqrt(значение)
 */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату х первой точки треугольника на плоскости:");
        double x1 = scanner.nextDouble();

        System.out.println("Введите координату y первой точки треугольника на плоскости:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координату x второй точки треугольника на плоскости:");
        double x2 = scanner.nextDouble();

        System.out.println("Введите координату y второй точки треугольника на плоскости:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координату x третьей точки треугольника на плоскости:");
        double x3 = scanner.nextDouble();

        System.out.println("Введите координату y третьей точки треугольника на плоскости:");
        double y3 = scanner.nextDouble();

        double epsilon = 1e-10;

        if (Math.abs((y2 - y1) * (x3 - x1) - (y3 - y1) * (x2 - x1)) <= epsilon) {
            System.out.println("Заданные точки лежат на одной прямой. Попробуйте еще раз");
            return;
        }

        double length12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double length23 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double length31 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double halfPerimeter = (length12 + length23 + length31) / 2;

        double area = Math.sqrt(halfPerimeter * (halfPerimeter - length12) * (halfPerimeter - length23) * (halfPerimeter - length31));
        System.out.println("Площадь треугольника с введенными координатами равна: " + area);
    }
}