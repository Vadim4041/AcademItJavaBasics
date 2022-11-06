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
        byte byteType = 1;
        System.out.println("Количество байт, требуемых под переменную byteType: " + getTypeSize(byteType));

        short shortType = 1;
        System.out.println("Количество байт, требуемых под переменную shortType: " + getTypeSize(shortType));

        int intType = 1;
        System.out.println("Количество байт, требуемых под переменную intType: " + getTypeSize(intType));

        long longType = 1;
        System.out.println("Количество байт, требуемых под переменную longType: " + getTypeSize(longType));

        float floatType = 1;
        System.out.println("Количество байт, требуемых под переменную floatType: " + getTypeSize(floatType));

        double doubleType = 1;
        System.out.println("Количество байт, требуемых под переменную doubleType: " + getTypeSize(doubleType));
    }

    public static int getTypeSize(byte type) {
        return 1;
    }

    public static int getTypeSize(short type) {
        return 2;
    }

    public static int getTypeSize(int type) {
        return 4;
    }

    public static int getTypeSize(long type) {
        return 8;
    }

    public static int getTypeSize(float type) {
        return 4;
    }

    public static int getTypeSize(double type) {
        return 8;
    }
}
