package com.company;

public class Main {

    public static void main(String[] args) {
        Files file = new Files("1");
        Directory directory = new Directory("C:\\Users\\HP\\IdeaProjects\\05_Basics_of_OOP\\Task01_TextFile\\.idea");
        TextFile textFile = new TextFile(file,directory);
        textFile.create();
        textFile.append("test");
        textFile.output();
        textFile.rename("2.txt");
        textFile.deleteFile("2.txt");
    }
}
