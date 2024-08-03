package com.amafis.model;
public class User {
    private int userId;
    private String username;
    private String password;
    private String role;
    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }
    @Override
    public String toString() {
        return "User ID: " + userId + ", Username: " + username + ", Role: " + role;
    }
}
