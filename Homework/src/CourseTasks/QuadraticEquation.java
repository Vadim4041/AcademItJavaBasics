package CourseTasks;

/*
• Прочитать с консоли коэффициенты a, b и c квадратного
уравнения  𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0 и найти решение этого
уравнения
• Не забыть рассмотреть все 3 случая – когда есть 2 корня, 1
корень и нет решений
• Программа должна работать даже если уравнение не
квадратное (a равен 0), например, решать линейное
уравнение и т.д.
 */

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a квадратного уравнения:");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b квадратного уравнения:");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c квадратного уравнения:");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double x1;
        double x2;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Все введенные коэффициенты равны нулю, попробуйте еще раз");
            return;
        }

        if (a == 0) {
            x1 = -c / b;
            System.out.println("Данное уравнение является линейным, его корень равен " + x1);
            return;
        }

        if (discriminant < 0) {
            System.out.println("У квадратного уравнения с введенными коэффициентами нет корней");
        } else if (discriminant == 0) {
            x1 = -b / 2 / a;
            System.out.println("У квадратного уравнения с введенными коэффициентами два одинаковых корня, равных " + x1);
        } else {
            x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
            x2 = (-b - Math.sqrt(discriminant)) / 2 / a;
            System.out.printf("У квадратного уравнения с введенными коэффициентами два разных корня, равных %f и %f", x1, x2);
        }
    }
}
