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

public class URL {
    public static void main(String[] args) {
        String siteUrl = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println(parseServerName(siteUrl));
    }

    public static String parseServerName(String siteUrl) {
        int startServerNameIndex = siteUrl.indexOf("://") + 3;
        int endServerNameIndex = siteUrl.indexOf("/", startServerNameIndex);

        if (siteUrl.lastIndexOf("/") == startServerNameIndex - 1) {
            endServerNameIndex = siteUrl.length();
        }

        return siteUrl.substring(startServerNameIndex, endServerNameIndex);
    }
}
