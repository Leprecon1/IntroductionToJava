package com.company;

public class Task05_DeleteSpaces {
    public static void main(String[] args) {
        String value = "  Patiently   Waiting       Bad    husband   ";
        char[] CharArray = value.toCharArray();
      System.out.println(DelSpace(CharArray));
    }

    public static char[] DelSpace(char[] text)
    {
        char[] output = new char[100];
        text = DelSpaceAtTheEnd(text);
        boolean NextWord;
        int k = -1;
        for (int i = 0; i < text.length; i++)
        {
            k++;
            if (Character.isSpaceChar((text[i])) && Character.isSpaceChar(text[i+1]))
            {
                output[k] = ' ';
                NextWord = false;
                for (int j = i; j < text.length; j++)
                {
                    if (Character.isSpaceChar((text[j]))  == false)
                    {
                        k++;
                        output[k] = text[j];
                        NextWord = true;
                        i = j;
                    }
                    else
                    {
                        if (NextWord)
                            break;
                    }
                }
            }
            else
            {
                output[k] = text[i];
            }
        }
        output = DelSpaceAtTheBeginning(output);
        return output;
    }

    public static char[] DelSpaceAtTheBeginning(char[] text) {
        char[] output = new char[100];
        if (Character.isWhitespace(text[0])){
            for (int i = 1; i < text.length; i++) {
                    output[i-1] = text[i];
            }
        return output;
    }
        return text;
    }

    public static char[] DelSpaceAtTheEnd(char[] text) {
        int i = text.length-1;
        char[] output = new char[100];
        if (Character.isWhitespace(text[text.length-1])){
            while(true){
              if  (!Character.isWhitespace(text[i])){
                  for (int j = i; j >= 0; j--){
                      output[j] = text[j];
              }
                  break;
              }
                i--;
            }
            return output;
        }
        return text;
    }
}

