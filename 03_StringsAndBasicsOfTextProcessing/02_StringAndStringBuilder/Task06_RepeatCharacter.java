package com.company;

public class Task06_RepeatCharacter {
    public static void main(String[] args) {
        String str = "a b c d e f g";
        System.out.println(createRepeatCharacter(str));
    }
    public static String createRepeatCharacter(String str){
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            str1 += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
        }
        return  str1;
    }
}
