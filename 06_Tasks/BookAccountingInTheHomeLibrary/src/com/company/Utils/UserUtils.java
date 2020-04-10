package com.company.Utils;
import com.company.Data.FileHandler;
import com.company.BaseClasses.User;
import com.company.BaseClasses.UserLevel;

import java.util.List;

public class UserUtils {
	FileHandler fileHandler = new FileHandler();
	InputUtil inputUtil = new InputUtil();

	private  List<User> users;

	 { users = fileHandler.loadUsers(); }

	public  List<User> getUsers() {
		return users;
	}

	public  User getAdmin() {
		for (User user : users) {
			if (user.getUserLevel().getName().equalsIgnoreCase("admin")) {
					return user;
			}
		}
		return null;
	}

	public  User login(String username, String password) {
		users = fileHandler.loadUsers();
		for (User user : users) {
			if (user.getLogin()
			        .equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
				return user;
			}
		}
		return null;
	}

	public  boolean isUserExist(String login) {
		return users.stream().anyMatch(u -> u.getLogin().equalsIgnoreCase(login));
	}

	public  boolean addUser() {
		User user = null;
		while (user == null){
			System.out.print("Введите логин: ");
			String login = inputUtil.checkInputLine();
			List<User> users = getUsers();
			if (isUserExist(login)) {
				System.out.println("Пользователь с логином :\"" + login + "\" уже существует!");
				return false;
			}
			System.out.print("Введите пароль: ");
			String password = inputUtil.checkInputLine();
			 user = new User(login,password, UserLevel.USER);
			users.add(user);
			fileHandler.saveUserList(users);
			return true;

		}
		 return  false;
	}
}

