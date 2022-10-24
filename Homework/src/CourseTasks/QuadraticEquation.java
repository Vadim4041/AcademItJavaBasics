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

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon) {
            if (Math.abs(c) <= epsilon) {
                System.out.println("Все коэффициенты равны нулю, следовательно, корней бесконечное количество, попробуйте еще раз");
            } else {
                System.out.println("Только коэффициенты a и b равны нулю, такое выражение не является уравнением, у него нет корней, попробуйте еще раз");
            }

            return;
        }

        if (Math.abs(a) <= epsilon) {
            double x = -c / b;
            System.out.println("Данное уравнение является линейным, его корень равен " + x);
            return;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < -epsilon) {
            System.out.println("У квадратного уравнения с введенными коэффициентами нет корней");
        } else if (Math.abs(discriminant) <= epsilon) {
            double x = -b / (2 * a);
            System.out.println("У квадратного уравнения с введенными коэффициентами два одинаковых корня, равных " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("У квадратного уравнения с введенными коэффициентами два разных корня, равных %f и %f", x1, x2);
        }
    }
}
