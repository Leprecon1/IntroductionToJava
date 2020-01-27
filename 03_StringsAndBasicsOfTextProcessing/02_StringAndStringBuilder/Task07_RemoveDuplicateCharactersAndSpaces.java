package com.company;

import java.util.HashSet;
import java.util.Set;

public class Task07_RemoveDuplicateCharactersAndSpaces {
    public static void main(String[] args) {
        String str = "abc cde def";
        String str1 = removeDups(str);
        str1 = str1.replaceAll(" ","");
        System.out.println(str1);
    }

    public static String removeDups(String word) {
        Set<Character> chars = new HashSet<>();
        StringBuilder output = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (chars.add(ch)) {
                output.append(ch);
            }
        }
        return output.toString();
    }
}
