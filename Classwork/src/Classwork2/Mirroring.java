package Classwork2;

/*
1. Вывести при помощи одного вызова System.out.println
сразу несколько строк при помощи перевода строки
2. Вывести следующие строки:
"30" августа 1903г.
C:\Windows\System32\Drivers\etc\hosts
3. Посчитать некоторое выражение и распечатать его
результат в виде строки. Вместо 4 – ваш результат:
Результат = 4
 */

public class Mirroring {
    public static void main(String[] args) {
        System.out.println("\"30\" августа 1903г." + System.lineSeparator() + "C:\\Windows\\System32\\Drivers\\etc\\hosts");
        int a = 55*16/2;
        System.out.println("Результат = " + a);
    }
}
