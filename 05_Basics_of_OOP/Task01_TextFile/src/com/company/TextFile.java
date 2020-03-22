package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class TextFile {
    private  String fileName;
    private  String directory;

    public TextFile(Files file, Directory directory){
        this.fileName = file.getFileName() + ".txt";
        this.directory = directory.getPath();
    }

    public void create(){

            File f = new File(getFileName());
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }

    public void append(String data){
        File f = new File(getFileName());
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println(data);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void output(){
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(getFileName()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            String line = "";
            while (true) {
                try {
                    line = bf.readLine();
                    if ( line == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(line);
            }

        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rename(String name){
        File f = new File(getFileName());
        File f1 = new File(name);
        f.renameTo(f1);
        this.fileName = f1.getName();
    }

    public void deleteFile(String name){
        File f = new File(name);
        f.delete();
    }


    public String getFileName() {
        return fileName;
    }

    public String getDirectory() {
        return directory;
    }
}
