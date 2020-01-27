package com.company;

public class Task02_InsertElements {
    public static void main(String[] args) {
        String text = " ae ar a df ag a a";
        System.out.println(insertElement((text)));
    }
    public  static  String insertElement(String text){
        StringBuilder sb = new StringBuilder(text);
        int n = 1;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'a') {
                sb.insert(i + n, 'b');
                n++;
            }

        }
        return String.valueOf(sb);
    }
}
