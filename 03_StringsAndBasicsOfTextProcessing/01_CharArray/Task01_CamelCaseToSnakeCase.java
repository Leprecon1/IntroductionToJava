package com.company;

import java.sql.SQLOutput;

public class Task01_CamelCaseToSnakeCase {

    public static void main(String[] args) {
        String value = "simpleMethod myMethod myBestMethod";
        char[] array = value.toCharArray();
        char[] b = convertToNewCase(array);
        System.out.print("camelCase : ");
        System.out.println(array);
        System.out.println("snake_case ");
        System.out.println(b);
    }

    public static char[] convertToNewCase(char[] arr) {
        char[] b = new char[100];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Character.toUpperCase(arr[i]) && !Character.isSpaceChar(arr[i])) {
                b[n] = '_';
                b[n+1] = Character.toLowerCase(arr[i]);
                n++;
            }
            else {
                b[n] = arr[i];
            }
            n++;
        }
        return b;
    }

}
