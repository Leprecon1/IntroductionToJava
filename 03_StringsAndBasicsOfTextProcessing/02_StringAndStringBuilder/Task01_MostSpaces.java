package com.company;

public class Task01_MostSpaces {

    public static void main(String[] args) {
        String text = "The    largest number     of spaces";
        System.out.println("numbers of space = " + findMostSpacesNumber(text));
    }
    private static int findMostSpacesNumber(String text){
        int k = 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                k++;
            }
            else {
                if (count < k) {
                    count = k;
                }
                k = 0;
            }

        }
        return  count;
    }
}
