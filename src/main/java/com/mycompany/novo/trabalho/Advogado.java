/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
public class Advogado extends Usuario {
    private int registro;

    public Advogado(String nome, String cpf, String login, String senha, int registro) {
        super(nome, cpf, login, senha);
        setRegistro(registro);
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
	    if (registro <= 0) {
		   throw new IllegalArgumentException("Registro do Advogado não pode ser menor ou igual a zero.");
	    }
        this.registro = registro;
    }

    @Override
    public String toString() {
	    return super.toString() + " Registro: " + getRegistro();
    }
}
