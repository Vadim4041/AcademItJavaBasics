package Homework7;

/*
• Создать класс Range (непрерывный вещественный числовой
диапазон на прямой). В нём:
1. Объявить два вещественных поля from, to
2. Описать конструктор, при помощи которого заполняются
поля
3. Реализовать геттеры и сеттеры для полей
4. Сделать метод для получения длины диапазона
5. Сделать метод isInside, который принимает
вещественное число и возвращает boolean – результат
проверки, принадлежит ли число диапазону
• После этого написать небольшую программу с
использованием этого класса
 */

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getRange() {
        return to - from;
    }

    public boolean isInside(double numberToCheck) {
        return numberToCheck >= from && numberToCheck <= to;
    }
}
