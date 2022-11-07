package Homework6;

/*
• Объявить в классе несколько функций с именем getTypeSize
• Каждая функция должна принимать один аргумент одного
из следующих типов: byte, short, int, long, float, double
• Функция должна возвращать int – количество байт,
требуемых под переменную данного типа
• В функции main сделать по одному примеру использования
для каждой перегруженной функции
• В этой задаче может быть warning, что аргумент не
используется, его не исправляем
 */

public class Overload {
    public static void main(String[] args) {
        byte variable1 = 1;
        System.out.println("Количество байт, требуемых под переменную типа byte: " + getTypeSize(variable1));

        short variable2 = 1;
        System.out.println("Количество байт, требуемых под переменную типа short: " + getTypeSize(variable2));

        int variable3 = 1;
        System.out.println("Количество байт, требуемых под переменную типа int: " + getTypeSize(variable3));

        long variable4 = 1;
        System.out.println("Количество байт, требуемых под переменную типа long: " + getTypeSize(variable4));

        float variable5 = 1;
        System.out.println("Количество байт, требуемых под переменную типа float: " + getTypeSize(variable5));

        double variable6 = 1;
        System.out.println("Количество байт, требуемых под переменную типа double: " + getTypeSize(variable6));
    }

    public static int getTypeSize(byte variable) {
        return 1;
    }

    public static int getTypeSize(short variable) {
        return 2;
    }

    public static int getTypeSize(int variable) {
        return 4;
    }

    public static int getTypeSize(long variable) {
        return 8;
    }

    public static int getTypeSize(float variable) {
        return 4;
    }

    public static int getTypeSize(double variable) {
        return 8;
    }
}
