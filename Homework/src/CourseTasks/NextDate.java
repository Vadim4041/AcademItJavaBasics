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

import java.text.ParseException;
import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня, месяца и год через пробел:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int dayNumber = Integer.parseInt(parts[0]);
        int monthNumber = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        int maxDayNumber = 31;

        if (dayNumber < 1 || dayNumber > maxDayNumber) {
            System.out.println("Номер дня в месяце не может быть меньше 1 и больше 31");
            return;
        }

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца не может быть меньше 1 и больше 12");
            return;
        }

        if (year < 1) {
            System.out.println("Год не может быть отрицательным или равным нулю");
            return;
        }

        boolean monthNumberIsEven = monthNumber % 2 == 0;

        if (monthNumber <= 7) {
            if (monthNumberIsEven) {
                maxDayNumber = 30;
            }
        } else {
            if (!monthNumberIsEven) {
                maxDayNumber = 30;
            }
        }

        if (monthNumber == 2) {
            if ((year % 4 != 0) || (year % 400 != 0 && year % 100 == 0)) {
                maxDayNumber = 28;
            } else {
                maxDayNumber = 29;
            }
        }

        if (dayNumber > maxDayNumber) {
            System.out.println("В данном месяце не существует дня с таким номером");
            return;
        }

        String monthNumberString;

        if (monthNumber < 10) {
            monthNumberString = "0" + monthNumber;
        } else {
            monthNumberString = Integer.toString(monthNumber);
        }

        String dayNumberString;

        if (dayNumber < 10) {
            dayNumberString = "0" + dayNumber;
        } else {
            dayNumberString = Integer.toString(dayNumber);
        }

        String inputDate = String.format("%s.%s.%d", dayNumberString, monthNumberString, year);

        System.out.println("Введенная дата: " + inputDate);

        int nextDayNumber = dayNumber + 1;

        String nextDayNumberString;

        if (nextDayNumber < 10) {
            nextDayNumberString = "0" + nextDayNumber;
        } else {
            nextDayNumberString = Integer.toString(nextDayNumber);
        }

        int nextMonthNumber = monthNumber;
        String nextMonthNumberString = Integer.toString(nextMonthNumber);
        int nextYear = year;

        if (dayNumber == maxDayNumber) {
            if (monthNumber == 12) {
                nextMonthNumberString = "01";
                nextYear = year + 1;
            }
            nextDayNumberString = "01";
            nextMonthNumber = monthNumber + 1;
        }

        if (nextMonthNumber < 10) {
            nextMonthNumberString = "0" + nextMonthNumber;
        }

        String nextDate = String.format("%s.%s.%d", nextDayNumberString, nextMonthNumberString, nextYear);

        System.out.println("Следующий день имеет дату: " + nextDate);
    }
}
