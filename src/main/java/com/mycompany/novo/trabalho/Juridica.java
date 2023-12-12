/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
public class Juridica extends Pessoa{
    private String cnpj;

    public Juridica(String nome, String cnpj) {
        super(nome);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
	    if (cnpj == null || cnpj.isEmpty()) {
		   throw new IllegalArgumentException("Cnpj pessoa juridica não pode ser vazio ou nulo.");
	    }
        this.cnpj = cnpj;
    }

    public String toString(){
        return super.toString() + "\nCNPJ: " + getCnpj()+ '\n';
    }
}