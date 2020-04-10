package com.company.Data;
import com.company.BaseClasses.Book;
import com.company.BaseClasses.BookType;
import com.company.BaseClasses.User;
import com.company.BaseClasses.UserLevel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private  String userFile = "AllUsers.txt";
    private  String catalogFile = "BookCatalog.txt";

    public  List<User> loadUsers() {
        String line;
        String splitBy = ", ";
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(userFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                User user = new User(data[0],data[1], UserLevel.valueOf(data[2].toUpperCase()));
                users.add(user);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public  void saveUserList(List<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(userFile))) {
            for (User user : users) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getLogin());
                sb.append(", ");
                sb.append(user.getPassword());
                sb.append(", ");
                sb.append(user.getUserLevel().name().toLowerCase());
                bw.write(sb.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  List<Book> loadBooks() {
        String line;
        String splitBy = ", ";
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(catalogFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                Book book = new Book(data[0],data[1],Integer.valueOf(data[2]), BookType.valueOf(data[3].toUpperCase()));
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

    public  void saveCatalog(List<Book> books) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(catalogFile))) {
            for (Book book : books) {
                StringBuilder sb = new StringBuilder();
                sb.append(book.getAuthor());
                sb.append(", ");
                sb.append(book.getTitle());
                sb.append(", ");
                sb.append(book.getYear());
                sb.append(", ");
                sb.append(book.getType().name().toLowerCase());

                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
