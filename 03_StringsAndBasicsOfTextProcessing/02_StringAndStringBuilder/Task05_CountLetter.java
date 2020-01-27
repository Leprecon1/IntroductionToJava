package com.company;

public class Task05_CountLetter {
    public static void main(String[] args) {
        String text = " ae ar a df ag a a";
        System.out.println("count = " + countLetter(text));
    }
    public static int countLetter(String text) {
        int count = 0;
        for ( int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'a')
                count++;
        }
        return count;
    }
}

