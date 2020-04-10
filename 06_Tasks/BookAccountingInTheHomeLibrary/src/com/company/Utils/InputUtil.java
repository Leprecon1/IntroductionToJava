package com.company.Utils;

import com.company.BaseClasses.BookType;
import com.company.BaseClasses.UserLevel;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtil {
    private  Scanner scanner = new Scanner(System.in);

    public String checkInputLine() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{4,30}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Некорректный ввод.");
        }
        return scanner.nextLine().trim();
    }

    public int checkInputChoice(UserLevel userLevel) {
        Pattern pattern;
        if(userLevel == UserLevel.ADMIN) {
            pattern = Pattern.compile("[0-6[9]]");
        } else {
            pattern = Pattern.compile("[0-3[9]]");
        }
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Недоступна операция.");
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public  int checkInputYear() {
        Pattern pattern = Pattern.compile("[\\d ]{4}");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Год должен быть четырехзначным.");
        }
        return scanner.nextInt();
    }

    public BookType checkInputBookType() {
        Pattern pattern = Pattern.compile("[1-2]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Некорректный ввод!");
        }
        if (scanner.nextInt() == 1) {
            return BookType.EBOOK;
        } else return BookType.PAPER;
    }

    public  int checkPageNumber() {
        Pattern pattern = Pattern.compile("[\\d]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Некорректный ввод!");
        }
            return scanner.nextInt();
    }
}
