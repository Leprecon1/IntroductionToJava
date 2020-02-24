package com.company;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexExpressions {

    public static void main(String[] args) {
        String text = "London’s population has grown 7% in just five years." +
                "The UK as a whole has grown by 3% over this period? or 3% excluding London.\n" +
                "Inner London’s population has increased by 300,000 since 2011 to 3 million\n" +
                "Outer London’s population is 60% of the total. These numbers " +
                "are projected to grow to 3 and 5 million respectively by 2021.";

        System.out.println();
        System.out.println("Исходный текст:");
        System.out.println(text);
        System.out.println();
        System.out.println("1. отсортировать абзацы по количеству предложений");
        System.out.println("2. Отсортировать слова по длине");
        System.out.println("3. отсортировать слова в предложении по убыванию количества вхождений заданного символа");

        Scanner sc = new Scanner(System.in);
        while(true) {
            String a = sc.next();
            switch (a) {
                case "1":
                    String[] paragraphs = text.split("\\n");
                      String[] result = sortParagraphsByNumberOfSentences(paragraphs);
                      for(String i : result)
                      System.out.println(i);
                    break;

                case "2":
                String[] sentences = text.split("[.!?]\\s*");
                String[] LineByLength = sortLineByLength(sentences);
                for (String i : LineByLength)
                    System.out.println(i);
                break;
                case "3":
                    String[] sentences1 = text.split("[.!?]\\s*");
                    System.out.println("Введите символ для поиска");
                    String character = sc.next();
                    for (String i : sortWords(sentences1,character))
                        System.out.println(i);
                    break;
            }
        }

    }

    public  static String[] sortParagraphsByNumberOfSentences(String[] paragraphs) {
        int[] countOfSentences = countNumberOfSentences(paragraphs);
        boolean isSorted = false;
        String buf;
        int buf1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < countOfSentences.length - 1; i++) {
                if (countOfSentences[i] > countOfSentences[i + 1]) {
                    isSorted = false;

                    buf1 = countOfSentences[i];
                    countOfSentences[i] = countOfSentences[i+1];
                    countOfSentences[i+1] = buf1;

                    buf = paragraphs[i];
                    paragraphs[i] = paragraphs[i + 1];
                    paragraphs[i + 1] = buf;
                }
            }
        }
        return paragraphs;
    }

    public static int[] countNumberOfSentences(String[] paragraphs){
        int count = 0;
        int[] countOfSentences = new int[paragraphs.length];
        Pattern pattern = Pattern.compile("[.!?]");
        for (int i = 0; i < paragraphs.length; i++) {
            Matcher matcher = pattern.matcher(paragraphs[i]);
            while (matcher.find()) {
                count++;
            }
            countOfSentences[i] = count;
            count = 0;
        }
        return countOfSentences;
    }

    private static String[] sortLineByLength(String[] sentences){
        String[] splitLine;
        String[] LineByLength = new String[sentences.length];
        for ( int i = 0; i < sentences.length; i++){
            splitLine = sentences[i].split("\\s+");
            LineByLength[i] = sort(splitLine);
        }
        return  LineByLength;
    }

    private  static String sort(String[] splitLine){
        boolean isSorted = false;
        String temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < splitLine.length-1; i++) {
                if(splitLine[i].length() > splitLine[i+1].length()){
                    isSorted = false;

                    temp = splitLine[i];
                    splitLine[i] = splitLine[i+1];
                    splitLine[i+1] = temp;
                }
            }
        }
        String str="";
         for (int i = 0; i < splitLine.length; i++)
             str+=splitLine[i] + " ";
         return str;
    }

    public  static String[] sortWords(String[] sentences, String character) {
        String[] splitLine;
        String[] LineByLength = new String[sentences.length];
        for ( int i = 0; i < sentences.length; i++){
            splitLine = sentences[i].split("\\s+");
            LineByLength[i] = sortWordsByCharacterEntry(splitLine,character);
        }
        return  LineByLength;
    }

    public  static String sortWordsByCharacterEntry(String[] splitLine, String character) {
        int[] Occurences = numberOfOccurrencesOfCharacter(splitLine,character);
        boolean isSorted = false;
        String buf;
        int buf1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < Occurences.length - 1; i++) {
                if (Occurences[i] < Occurences[i + 1]) {
                    isSorted = false;

                    buf1 = Occurences[i];
                    Occurences[i] = Occurences[i+1];
                    Occurences[i+1] = buf1;

                    buf = splitLine[i];
                    splitLine[i] = splitLine[i + 1];
                    splitLine[i + 1] = buf;
                }
            }
        }
        String str="";
        for (int i = 0; i < splitLine.length; i++)
            str+=splitLine[i] + " ";
        return str;
    }

    public static int[] numberOfOccurrencesOfCharacter(String[] splitLine, String character){
        int[] countOccurences = new int[splitLine.length];
        int count = 0;
        Pattern pattern = Pattern.compile(character);
        for (int i = 0; i < splitLine.length; i++) {
            Matcher matcher = pattern.matcher(splitLine[i]);
            while (matcher.find()) {
                count++;
            }
            countOccurences[i] = count;
            count = 0;
        }
        return  countOccurences;
    }
}

  
