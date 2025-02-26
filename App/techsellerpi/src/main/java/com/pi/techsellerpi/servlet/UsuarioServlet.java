package com.pi.techsellerpi.servlet;

import com.pi.techsellerpi.model.usuarioModel;

public class UsuarioServlet {

    //Declaração de variaveis
    private String nome, cpf, email, grupo, senha, status;

    //declarando um construto padrão
    public UsuarioServlet(){}

    public UsuarioServlet(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
}
