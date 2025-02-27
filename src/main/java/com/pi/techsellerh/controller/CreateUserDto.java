package com.pi.techsellerh.controller;

import com.pi.techsellerh.entity.UserRole;

public record CreateUserDto(String username, String email, String password, boolean ativo, UserRole role) {
}
