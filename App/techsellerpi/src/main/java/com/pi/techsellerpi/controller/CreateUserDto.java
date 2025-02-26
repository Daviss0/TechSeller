package com.pi.techsellerpi.controller;

public record CreateUserDto(String username, String email, String password, boolean ativo, String nivel) {


}
