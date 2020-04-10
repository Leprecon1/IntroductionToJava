package com.company.Utils;

import com.company.BaseClasses.*;
import com.company.Data.FileHandler;

import java.util.List;
import java.util.stream.Collectors;

public class CatalogUtil {
    FileHandler fileHandler = new FileHandler();
    UserUtils userUtils = new UserUtils();
    InputUtil inputUtil = new InputUtil();

    public  boolean printBooks(List<Book> books) {
        if(books.size() != 0) {
            int page = 1;
            int booksOnPage = 5;
            int numberOfPages = books.size() / booksOnPage + 1;
            while (page > 0 && page <= numberOfPages) {
                System.out.println("Страница " + page + " из " + numberOfPages + ":");
                int i = page * booksOnPage - booksOnPage;
                for (; i < page * booksOnPage && i < books.size(); i++) {
                    System.out.print(i + 1 + " ");
                    System.out.println(getBookLine(books.get(i)));
                }
                System.out.print("Введите -0- для выхода: ");
                page = inputUtil.checkPageNumber();
            }
            return true;
        }
        return false;
    }

    public  boolean addBook(Catalog catalog, Book book) {
        if (!catalog.getBooks().contains(book)) {
            catalog.getBooks().add(book);
            fileHandler.saveCatalog(catalog.getBooks());
            for (User user : userUtils.getUsers()) {
                if (!user.getUserLevel().getName().equals("admin")) {
                    Letter letter = new Letter(user.getEmail(), userUtils.getAdmin().getEmail(), book);
                    letter.sendLetter();
                    System.out.println("Пользователь " + user.getUsername() + " получил письмо");
                }
            }
                return true;
        }
        return false;
    }

    public  boolean suggestBook(Catalog catalog, Book book) {
        if (!catalog.getBooks().contains(book)) {
            Letter letter = new Letter(userUtils.getAdmin().getEmail(), catalog.getUser().getEmail(), book);
            if (letter.sendLetter()) {
                return true;
            }
        }
        return false;
    }

    public  boolean removeBook(Catalog catalog, Book book) {
        if (catalog.getBooks().remove(book)) {
            fileHandler.saveCatalog(catalog.getBooks());
            return true;
        } else {
            return false;
        }
    }

    public  String getBookLine(Book book) {
        return String.format("%s, \"%s\", %d год, тип: %s",
                    book.getAuthor(), book.getTitle(),
                    book.getYear(), book.getType().getName());
    }

    public  Book createBook() {
        Book book = new Book();
        System.out.print("Введите имя автора : ");
        book.setAuthor(inputUtil.checkInputLine());
        System.out.print("заголовок книги: ");
        book.setTitle(inputUtil.checkInputLine());
        System.out.print("год публикации: ");
        book.setYear(inputUtil.checkInputYear());
        System.out.print("Введите тип книги 1 - электронная книга, 2 - бумажная книга:");
        book.setType(inputUtil.checkInputBookType());
        return book;
    }

    public  boolean findBook(Catalog catalog) {
        List<Book> books;
        System.out.print("\"1\" - искать по авторам  \"2\" - искать по названию: ");
        int request = inputUtil.checkInputChoice(UserLevel.USER);
        if (request == 1) {
            System.out.print("Введите автора: ");
            String author = inputUtil.checkInputLine();
            books = findBookByAuthor(catalog.getBooks(), author);
        } else if (request == 2) {
            System.out.print("Введите название книги: ");
            String title = inputUtil.checkInputLine();
            books = findBookByTitle(catalog.getBooks(), title);
        } else { return false;}
        if(books.size() != 0) {
            printBooks(books);
        } else {
            System.out.println("Такой книги нету.");
        }
        return true;
    }

    public  List<Book> findBookByAuthor(List<Book> books, String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    public  List<Book> findBookByTitle(List<Book> books, String title) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }
}
