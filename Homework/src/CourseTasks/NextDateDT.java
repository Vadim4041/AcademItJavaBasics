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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextDateDT {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня, месяца и год через пробел:");
        String input = scanner.nextLine();

        DateTimeFormatter parser = DateTimeFormatter.ofPattern("d M y"); // TODO не выдает ошибки, если вбивать 30.2.2000
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.y");

        LocalDate date = LocalDate.parse(input, parser);
        String formattedDate = date.format(formatter);

        System.out.println("Введенная дата: " + formattedDate);

        LocalDate dateNext = date.plusDays(1);
        String correctDate = dateNext.format(formatter);

        System.out.println("Следующий день имеет дату: " + correctDate);

    }
}
