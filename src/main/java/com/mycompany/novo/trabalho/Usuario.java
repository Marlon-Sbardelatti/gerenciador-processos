/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
public abstract class Usuario extends Fisica{
    private String login;
    private String senha;


    public Usuario(String nome, String cpf, String login, String senha) {
        super(nome, cpf);
        setLogin(login);
        setSenha(senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
	    if (login == null || login.isEmpty()) {
		   throw new IllegalArgumentException("Login de usuario não pode ser nulo ou vazio.");
	    }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
	    if (senha == null || senha.isEmpty()) {
		   throw new IllegalArgumentException("Senha de usuario não pode ser nulo ou vazio.");
	    }
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
