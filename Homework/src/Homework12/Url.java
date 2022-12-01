package Homework12;

/*
• Написать функцию, которая вычленяет из URL адреса имя
сервера. Имеется в виду следующее. Для строки вида
http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
вычленить SomeServerName
• Строка может начинаться не обязательно с http, но и с https
или чего-то другого. Но :// есть всегда
• Учесть случай, когда после :// больше нет слэша:
• http://SomeServerName
• Использовать indexOf и substring
 */

public class Url {
    public static void main(String[] args) {
        String siteUrl = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println(getServerName(siteUrl));
    }

    public static String getServerName(String url) {
        int startServerNameIndex = url.indexOf("://") + 3;
        int endServerNameIndex = url.indexOf("/", startServerNameIndex);

        if (endServerNameIndex == -1) {
            endServerNameIndex = url.length();
        }

        return url.substring(startServerNameIndex, endServerNameIndex);
    }
}
