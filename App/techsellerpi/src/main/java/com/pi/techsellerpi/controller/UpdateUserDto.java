package com.pi.techsellerpi.controller;

public record UpdateUserDto(String username, String password, boolean ativo, String nivel) {
}
