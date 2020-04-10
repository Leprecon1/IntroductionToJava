package com.company.BaseClasses;


public class User {
    private String username;
    private String login;
    private String password;
    private UserLevel userLevel;
    private Email email;

    public User(String login, String password, UserLevel userLevel) {
        this.login = login;
        this.password = password;
        this.userLevel = userLevel;
    }



    public String getUsername() {
        return username;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public UserLevel getUserLevel() {
        return userLevel;
    }
    public Email getEmail() {
        return email;
    }

}
