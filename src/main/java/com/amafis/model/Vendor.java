package com.amafis.model;
public class Vendor extends User {
    public Vendor(int userId, String username, String password) {
        super(userId, username, password);
    }
    @Override
    public String getRole() {
        return "Vendor";
    }
}
