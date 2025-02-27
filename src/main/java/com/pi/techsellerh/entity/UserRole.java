package com.pi.techsellerh.entity;

public enum UserRole {

    ADMIN(2),

    USER(1);


    private int role;

    UserRole(int role) {
        this.role = role;

    }

    public int getRole() {
        return role;
    }
}
