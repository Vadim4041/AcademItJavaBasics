package CourseTasks;

/*
• Есть дом с известным количеством этажей и подъездов.  Все
подъезды одинаковые, на каждом этаже в подъезде 4 квартиры.
• Считаем, что номера квартир на лестничной площадке
распределяются так:
• То есть можно сказать, что квартира 1 – ближняя слева, квартира
2 – дальняя слева, квартира 3 – дальняя справа, квартира 4 –
ближняя справа
• Прочитать с консоли количество этажей, подъездов и номер
квартиры. По введенному номеру квартиры выдать номер
подъезда и этажа, где находится эта квартира, а также
положение квартиры на лестничной площадке
• Выдать сообщение, если квартиры с таким номером нет в доме
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class CourseTaskFlats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей в доме:");
        int floors = scanner.nextInt();
        System.out.println("Введите количество подъездов в доме: ");
        int entrances = scanner.nextInt();
        System.out.println("Введите номер искомой квартиры: ");
        int flat = scanner.nextInt();

        int flatsOnFloor = 4;

        int flatsTotal = floors * entrances * flatsOnFloor;
        System.out.println("Всего квартир в доме: " + flatsTotal);

        if (flat > flatsTotal || flat < 1) {
            System.out.printf("Неправильный номер квартиры. Он не может быть больше %d и меньше единицы. Выберите существующий номер квартиры", flatsTotal);
            System.exit(0);
        }

        double entrance = ceil((double) flat / (flatsOnFloor * floors));
        double floor = ceil((flat - (entrance - 1) * floors * flatsOnFloor) / flatsOnFloor);
        int flatNumberOnFloor = flat % flatsOnFloor;

        String flatDescription;
        switch (flatNumberOnFloor) {
            case 1 -> flatDescription = "ближняя слева";
            case 2 -> flatDescription = "дальняя слева";
            case 3 -> flatDescription = "дальняя справа";
            case 0 -> flatDescription = "ближняя справа";
            default -> flatDescription = "Ошибка! Неправильное количество квартир на площадке!";
        }
        System.out.printf("Квартира %d находится в %.0f подъезде на %.0f этаже. Квартира %s.", flat, entrance, floor, flatDescription);
    }
}
