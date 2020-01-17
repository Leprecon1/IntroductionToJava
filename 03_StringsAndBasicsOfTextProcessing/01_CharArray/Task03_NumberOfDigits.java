package com.company;

public class Task03_NumberOfDigits {
    public static void main(String[] args) {
        String mainString = "dfs4 5 3 ld3fjkw42f 6ertd1 345wrd45";
        char[] array = mainString.toCharArray();
        System.out.println(mainString);
        int numberOfDigits = countingDigits(array);
        System.out.println("number of digits = "+numberOfDigits);
    }
    public static int countingDigits(char[] arr){
        int count = 0;
        boolean isPreviousDigit = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (Character.isDigit(arr[i])) {
                if (!isPreviousDigit && !Character.isDigit((arr[i+1]))) {
                    count++;
                    isPreviousDigit = true;
                }
                else isPreviousDigit = true;
            }
            else {
                isPreviousDigit = false;
            }
        }
        if (Character.isDigit(arr[arr.length-1]) && !Character.isDigit(arr[arr.length-2]))
            count++;
        return count;
    }
}
