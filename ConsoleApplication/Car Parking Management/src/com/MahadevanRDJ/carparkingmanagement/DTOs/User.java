package com.MahadevanRDJ.carparkingmanagement.DTOs;

public class User {
    private String userFirstName;
    private String userLastName;
    private String userName;
    private String password;

    public User(String userFirstName, String userLastName, String userName, String password) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userName = userName;
        this.password = password;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
