package com.pi.techsellerh.controller;

import com.pi.techsellerh.entity.UserRole;

public record UpdateUserDto(String username, String email, String password, boolean ativo, UserRole role) {
}
