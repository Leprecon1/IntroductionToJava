package com.company;

public class Main {

    public static void main(String[] args) {
        Word word = new Word("HEAD");
        Text text = new Text(word);

        Word word1 = new Word("word1");
        Word word2 = new Word("word2");
        Word word3 = new Word("word3");

        Sentence sentence = new Sentence();
        sentence.addValue(word1);
        sentence.addValue(word2);
        sentence.addValue(word3);

        text.addBody(sentence);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Sentence: "+text.getBody());
    }
}
