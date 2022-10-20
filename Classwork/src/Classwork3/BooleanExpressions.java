package Classwork3;

public class BooleanExpressions {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean bool1 = !(a > 5 || !(a < b)) && !(b <= 9);
        boolean bool2 = (a <= 5 && a < b) && b > 9;
        boolean bool3 = (true && true) && true;
        boolean bool4 = true;
    }

}
