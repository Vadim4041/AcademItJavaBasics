package CourseTasks.Homework3;

/*
• Программа запрашивает сегодняшнюю дату и выдает дату
следующего дня
• Например, входные данные: 31 12 2015, на выходе:
01.01.2016
• День, месяц и год можно запрашивать у пользователя с
консоли по очереди
• Еще сделать проверку даты на корректность
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class NextDateOldLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня текущего месяца: ");
        int dayNumber = scanner.nextInt();

        System.out.println("Введите номер текущего месяца: ");
        int monthNumber = scanner.nextInt();

        System.out.println("Введите текущий год: ");
        int year = scanner.nextInt();

        String monthNumberString;

        if (monthNumber < 10) {
            monthNumberString = "0" + monthNumber;
        } else {
            monthNumberString = Integer.toString(monthNumber);
        }

        String inputDate = String.format("%d.%s.%d", dayNumber, monthNumberString, year);
        System.out.println(inputDate);

        Calendar calendar = new GregorianCalendar(year, monthNumber - 1, dayNumber);
        DateFormat df = new SimpleDateFormat("dd.MM.yyy", Locale.ENGLISH);
        String correctDate = df.format(calendar.getTime());

        System.out.println(correctDate);

        if (correctDate.equals(inputDate)) {
            System.out.println("Введенная дата: " + inputDate);

            calendar.add(Calendar.DAY_OF_MONTH, 1);

            System.out.println("Следующий день имеет дату: " + df.format(calendar.getTime()));
        } else {
            System.out.println("Введенная дата некорректна. Попробуйте еще раз");
        }
    }
}
