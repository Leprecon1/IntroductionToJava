package com.company.Utils;

import com.company.BaseClasses.Book;
import com.company.BaseClasses.Catalog;
import com.company.BaseClasses.User;
import com.company.BaseClasses.UserLevel;
import com.company.Data.FileHandler;

import java.util.List;
import java.util.Scanner;

public class MainMenuUtil {
    FileHandler fileHandler = new FileHandler();
    UserUtils userUtils = new UserUtils();
    InputUtil inputUtil = new InputUtil();
    CatalogUtil catalogUtil = new CatalogUtil();

    private Catalog catalog = null;
    public void start() {
        System.out.println("Добро пожаловать в домашнюю библиотеку!");
        registration();
        if(entrance()) {
            System.out.println("Вы успешно вошли в систему!.");
        }
        while (true) {
            UserLevel userLevel = catalog.getUser().getUserLevel();
            System.out.println(getMainOptions(userLevel));
            int option = inputUtil.checkInputChoice(userLevel);
            if (option != 0) {
                performOperation(option);
            } else {
                System.out.println("Жду тебя снова =>");
                break;
            }
        }
    }

    private  boolean entrance() {
        User user = null;
        while (user == null) {
            System.out.print("Введите логин:");
            String username = inputUtil.checkInputLine();
            System.out.print("Введите пароль:");
            String password = inputUtil.checkInputLine();
            user = userUtils.login(username, password);
            if(user == null) {
                System.out.println("Не верный логин или пароль.");
             }
        }
        List<Book> books = fileHandler.loadBooks();
        catalog =  new Catalog(user, books);
        return true;
    }

    private  boolean registration(){
        System.out.println("Вы тут в первый раз? Можете нажать 1 для регистрации или 0 чтобы пропустить этот шаг");
        Scanner sc = new Scanner(System.in);
        int choice =  sc.nextInt();
        switch (choice){
            case 1:
                userUtils.addUser();
                System.out.println("Вы добавлены в систему!");
                break;
            default:
                System.out.println("тогда введите свой логин и пароль");
                break;
        }
        return true;
    }

    private  String getMainOptions(UserLevel userLevel) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nДоступные Варианты:\n").append("1.Посмотреть все книги\n");
        sb.append("2.Найти книгу.\n");
        if(userLevel == UserLevel.ADMIN) {
            sb.append("3.Добавить книгу.\n");
            sb.append("4.удалить книгу.\n");
        } else {
            sb.append("3.Предложить администрации добавит книгу.\n");
        }
        sb.append("0.Закончить работу .\n");
        return sb.toString();
    }

    private  void performOperation(int option) {
        switch (option) {
            case 1:
                if (!catalogUtil.printBooks(catalog.getBooks())){
                        System.out.println("Каталог пустой.\n");
                }
                break;
            case 2:
                while (!catalogUtil.findBook(catalog)) {
                    System.out.println("Ошибка запроса.");
                }
                break;
            case 3:
                Book book = catalogUtil.createBook();
                if (catalog.getUser().getUserLevel() == UserLevel.ADMIN) {
                    if (catalogUtil.addBook(catalog, book)) {
                        System.out.println("Книга добавлена.");
                    } else {
                        System.out.println("Такая книга уже есть.\n");
                    }
                } else {
                    if (catalogUtil.suggestBook(catalog, book)) {
                        System.out.println("Книга отправлена администрации на e-mail.");
                    } else {
                        System.out.println("Книга уже есть в каталоге.\n");
                    }
                }
                break;
            case 4:
                Book removeBook = catalogUtil.createBook();
                if (catalogUtil.removeBook(catalog, removeBook)) {
                    System.out.println("Книга  удалена.");
                } else {
                    System.out.println("Такой книги не существует!");
                }
                break;
        }
    }
}
