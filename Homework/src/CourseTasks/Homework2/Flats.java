package CourseTasks.Homework2;

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

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей в доме:");
        int floorsQuantity = scanner.nextInt();

        System.out.println("Введите количество подъездов в доме:");
        int entrancesQuantity = scanner.nextInt();

        System.out.println("Введите номер искомой квартиры:");
        int flatNumber = scanner.nextInt();

        int flatsQuantityOnFloor = 4;

        int flatsQuantity = floorsQuantity * entrancesQuantity * flatsQuantityOnFloor;
        System.out.println("Всего квартир в доме: " + flatsQuantity);

        if (flatNumber < 1 || flatNumber > flatsQuantity) {
            System.out.printf("Неправильный номер квартиры. Он не может быть больше %d и меньше единицы. Выберите существующий номер квартиры.", flatsQuantity);
            return;
        }

        int entranceNumber = (int) Math.ceil((double) flatNumber / (flatsQuantityOnFloor * floorsQuantity));
        int floorNumber = (int) Math.ceil(((double) flatNumber - (entranceNumber - 1) * floorsQuantity * flatsQuantityOnFloor) / flatsQuantityOnFloor);
        int flatIndexOnFloor = flatNumber % flatsQuantityOnFloor;

        String flatLocationOnFloor;

        switch (flatIndexOnFloor) {
            case 1 -> flatLocationOnFloor = "ближняя слева";
            case 2 -> flatLocationOnFloor = "дальняя слева";
            case 3 -> flatLocationOnFloor = "дальняя справа";
            default -> flatLocationOnFloor = "ближняя справа";
        }

        System.out.printf("Квартира %d находится в %d подъезде на %d этаже. Квартира %s.", flatNumber, entranceNumber, floorNumber, flatLocationOnFloor);
    }
}
