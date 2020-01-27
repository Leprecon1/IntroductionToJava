package com.company;

public class Task10_NumberSentences {
    public static void main(String[] args) {
        String str = "My simple sentences. My simple sentences? My simple sentences!";
        System.out.println("count of sentences = " + countSentences(str));
    }

    public static int countSentences(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!')
                count++;
        }
        return count;
     }
}

