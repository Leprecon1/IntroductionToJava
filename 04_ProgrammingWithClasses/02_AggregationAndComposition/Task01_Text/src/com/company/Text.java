package com.company;

public class Text {
    private String header;
    private String body = "";

    public Text(Word word) {
        this.header = word.getValue();
    }

    public Text(Sentence sentence) {
        this.header = sentence.getValue();
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public void addBody(Sentence sentence) {
        this.body +=sentence.getValue() + " ";
    }
}
