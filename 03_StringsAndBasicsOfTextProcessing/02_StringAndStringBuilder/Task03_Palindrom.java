package com.company;

public class Task03_Palindrom {
    public static void main(String[] args) {
        String str = "geeg";
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
