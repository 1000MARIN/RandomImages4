package com.example.randomimages4.result;

public class User {
    private String userID;
    private String fullName;

    public User() {
    }

    public User(String userID, String fullName ) {
        this.userID = userID;
        this.fullName = fullName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
