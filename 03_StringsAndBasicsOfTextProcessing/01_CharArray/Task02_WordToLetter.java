package com.company;

import javax.xml.transform.Source;

public class Task02_WordToLetter {
    public static void main(String[] args) {
        String value = "wordl ldfjkwordsdf word 345word45";
        String findWord = "word";
        String replaceWord = "letter";
        char[] array = value.toCharArray();
        System.out.println(array);
        char[] outputArray = replace(array, findWord, replaceWord);
        System.out.println(outputArray);

    }

    public static char[] replace(char[] arr, String findWord, String replaceWord) {
        char[] outputArray = new char[100];
        char[] word = findWord.toCharArray();
        char[] letter = replaceWord.toCharArray();
        int n = 0;
        boolean contain;
        for (int i = 0; i < arr.length; i++) {
         contain = isWord(arr,word,i);

            if (contain) {
                for (int j = i; j < letter.length + i; j++) {
                    outputArray[n] = letter[j - i];
                    n++;
                }
                i += word.length - 1;
            } else {
                outputArray[n] = arr[i];
                n++;
            }
        }
        return outputArray;
    }

    public static boolean isWord(char[] arr, char[] word, int i) {
        int k = 0;

        for (int j = i; j < word.length + i; j++) {
            if (j == arr.length)
                break;
            if (arr[j] == word[j - i]) {
                k++;
            }

            if (k == word.length)
                return true;
        }
        return false;
    }
}
