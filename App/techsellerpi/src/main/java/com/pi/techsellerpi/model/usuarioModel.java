package com.pi.techsellerpi.model;

public class usuarioModel {

    //Declaração de variaveis
    private String nome, cpf, email, grupo, senha, status;

    //declarando um construto padrão
   public  usuarioModel(){}

    public void UsuarioServlet(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
}
