package Homework2;

/*
Посчитайте на Java следующие выражения:
• 𝑥 = 3 − 56 −12
44 ∗ 4
2 • 𝑦 = 2𝑥
33 −𝑥 • 𝑧 = −𝑥
2𝑦
• * При вычислении x у вас может возникнуть warning, его
поправлять не нужно
 */

public class Task1ExpressionCalculation {
    public static void main(String[] args) {
        double x = 3 - (56 - 12) / 44 * 4 / 2;
        double y = 2 * x / (33 - x);
        double z = -x / (2 * y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
