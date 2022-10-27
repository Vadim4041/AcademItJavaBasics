package Classwork4;

public class Question {
    public static void main(String[] args) {
        int x = 30;
        int y = 5;
        System.out.println(x++ + y--); //35
        System.out.println(++x - ++y); // 32 - 5 = 27
        System.out.println(x); // 32
        System.out.println(y); // 5
    }
}