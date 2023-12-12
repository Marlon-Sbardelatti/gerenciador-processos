/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
public class Fisica extends Pessoa{
    private String cpf;

    public Fisica(String nome, String cpf) {
        super(nome);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
	    if (cpf == null || cpf.isEmpty()) {
		   throw new IllegalArgumentException("Cpf pessoa fisica não pode ser vazio ou nulo.");
	    }
        this.cpf = cpf;
    }

    public String toString(){
        return super.toString() + "\nCPF: " + getCpf() + '\n';
    }
}
