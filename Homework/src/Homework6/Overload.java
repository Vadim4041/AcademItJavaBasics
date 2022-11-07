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
        byte byteVariable = 1;
        System.out.println("Количество байт, требуемых под переменную типа byte: " + getTypeSize(byteVariable));

        short shortVariable = 1;
        System.out.println("Количество байт, требуемых под переменную типа short: " + getTypeSize(shortVariable));

        int intVariable = 1;
        System.out.println("Количество байт, требуемых под переменную типа int: " + getTypeSize(intVariable));

        long longVariable = 1;
        System.out.println("Количество байт, требуемых под переменную типа long: " + getTypeSize(longVariable));

        float floatVariable = 1;
        System.out.println("Количество байт, требуемых под переменную типа float: " + getTypeSize(floatVariable));

        double doubleVariable = 1;
        System.out.println("Количество байт, требуемых под переменную типа double: " + getTypeSize(doubleVariable));
    }

    public static int getTypeSize(byte sizeInBytes) {
        return 1;
    }

    public static int getTypeSize(short sizeInBytes) {
        return 2;
    }

    public static int getTypeSize(int sizeInBytes) {
        return 4;
    }

    public static int getTypeSize(long sizeInBytes) {
        return 8;
    }

    public static int getTypeSize(float sizeInBytes) {
        return 4;
    }

    public static int getTypeSize(double sizeInBytes) {
        return 8;
    }
}
