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

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextDateLib {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня, месяца и год через пробел:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int dayNumber = Integer.parseInt(parts[0]);
        int monthNumber = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        String monthNumberString;

        if (monthNumber < 10) {
            monthNumberString = "0" + monthNumber;
        } else {
            monthNumberString = Integer.toString(monthNumber);
        }

        String inputDate = String.format("%d.%s.%d", dayNumber, monthNumberString, year);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.of(year, monthNumber, dayNumber);

        System.out.println("Введенная дата: " + inputDate);

        LocalDate dateNext = date.plusDays(1);
        String correctDate = dateNext.format(formatter);
        System.out.println("Следующий день имеет дату: " + correctDate);
    }
}
