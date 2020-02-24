package com.company;


import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateXML {
    public static void main(String[] args) {
        String text = "<notes>" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";
        String nodes = "";
        Pattern pattern = Pattern.compile("<(\\w*)(\\s+)[^/>]*>|>(\\S+)[^/>]*</");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            nodes+=(text.substring(matcher.start(), matcher.end()));
        }

        StringTokenizer st = new StringTokenizer(nodes,"[<>/]");
        while (st.hasMoreTokens()){
            System.out.println();
            System.out.println(st.nextToken());
            System.out.println("Получил сообщение:" + st.nextToken());
            System.out.println("отправитель:" + st.nextToken());
            System.out.println("Заголовок: " + st.nextToken());
            if (st.hasMoreTokens())
            System.out.println("Текст заметки : " + st.nextToken());
        }
    }
}
