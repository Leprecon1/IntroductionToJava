package com.company;

public class Task09_UppercaseAndLowercase {
    public static void main(String[] args) {
        String str = "My Simple String";
        System.out.println("Count = " + countWords(str));
    }
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (('a' <= str.charAt(i) && str.charAt(i) <= 'z') || ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'))
                count++;
     }
        return count;
    }
}
