/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
public class Secretaria extends Usuario{
    private int carteira;


    public Secretaria(String nome, String cpf, String login, String senha, int carteira) {
        super(nome, cpf, login, senha);
        setCarteira(carteira);
    }

    public int getCarteira() {
        return carteira;
    }

    public void setCarteira(int carteira) {
	    if (carteira <= 0) {
		   throw new IllegalArgumentException("Carteira da secretaria não pode ser menor ou igual a zero.");
	    }
        this.carteira = carteira;
    }

    @Override
    public String toString() {
	    return super.toString() + " Carteira: " + getCarteira();
    }
}
