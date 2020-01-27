package com.company;

public class Task08_LongWord {
    static String maxWord = "";
    public static void main(String[] args) {
        String a = "Maximum length word in string";
        maxLengthWords(a);
        System.out.print( "Maximum length word: "
                + maxWord);
    }

    static void maxLengthWords(String input)
    {
        int len = input.length();
        int si = 0, ei = 0;
        int maxLength = 0, maxStartIndex = 0;

        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {
                if (ei - si == maxLength)
                  return;
                int currLength = ei - si;
                if (currLength > maxLength )
                {
                    maxLength = currLength;
                    maxStartIndex = si;
                }
                ei++;
                si = ei;
            }
        }
        maxWord = input.substring(maxStartIndex, maxLength );
    }
}
