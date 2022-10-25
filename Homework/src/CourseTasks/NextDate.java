package CourseTasks;

/*
• Программа запрашивает сегодняшнюю дату и выдает дату
следующего дня
• Например, входные данные: 31 12 2015, на выходе:
01.01.2016
• День, месяц и год можно запрашивать у пользователя с
консоли по очереди
• Еще сделать проверку даты на корректность
 */

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня, месяца и год через пробел:");
        String inputDate = scanner.nextLine();

        String[] datePartsArray = inputDate.split(" ");

        if (datePartsArray.length != 3) {
            System.out.println("Вы ввели неверное количество данных. Попробуйте еще раз");
            return;
        }

        int day = Integer.parseInt(datePartsArray[0]);
        int month = Integer.parseInt(datePartsArray[1]);
        int year = Integer.parseInt(datePartsArray[2]);

        int maxDay = 31;

        if (day < 1 || day > maxDay) {
            System.out.println("Номер дня в месяце не может быть меньше 1 и больше 31");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Номер месяца не может быть меньше 1 и больше 12");
            return;
        }

        if (year < 1) {
            System.out.println("Год не может быть отрицательным или равным нулю");
            return;
        }

        boolean isMonthEven = month % 2 == 0;

        if (month == 2 && ((year % 4 != 0) || (year % 400 != 0 && year % 100 == 0))) {
            maxDay = 28;
        } else if (month == 2) {
            maxDay = 29;
        } else if ((isMonthEven && month <= 7) || (!isMonthEven && month > 7)) {
            maxDay = 30;
        }

        if (day > maxDay) {
            System.out.println("Введенной даты не существует");
            return;
        }

        System.out.printf("Введенная дата: %02d.%02d.%d%n", day, month, year);

        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (day == maxDay) {
            nextDay = 1;
            if (month == 12) {
                nextMonth = 1;
                nextYear = year + 1;
            } else {
                nextMonth = month + 1;
            }
        }

        System.out.printf("Следующий день имеет дату: %02d.%02d.%d%n", nextDay, nextMonth, nextYear);
    }
}