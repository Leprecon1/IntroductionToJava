package com.company;

public class Task04_ConcatAndCopy {
    public static void main(String[] args) {
        String str = "информатика";
       System.out.println(makeUpWords(str));
    }
    public static String makeUpWords(String str) {
        String str1 = "";
        str1 = str.substring(7,8).concat(str.substring(3,5)).concat(str.substring(7,8));
        return str1;
    }
}

