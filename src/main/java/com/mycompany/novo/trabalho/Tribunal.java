/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
import java.util.ArrayList;

public class Tribunal {
    private String nome;
    private int numero;
    private String uf;
    private ArrayList<Vara> varas;

    public Tribunal(String nome, int numero, String uf) {
        setNome(nome);
        setNumero(numero);
	setUf(uf);
        varas = new ArrayList<>();
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
	    if (uf == null || uf.isEmpty()) {
		   throw new IllegalArgumentException("UF do tribunal não pode ser nulo ou vazio.");
	    }
	    this.uf = uf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
	    if (nome == null || nome.isEmpty()) {
		   throw new IllegalArgumentException("Nome do tribunal não pode ser nulo ou vazio.");
	    }
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
	    if (numero <= 0) {
		   throw new IllegalArgumentException("Número do tribunal não pode ser menor ou igual a zero.");
	    }
        this.numero = numero;
    }

    public ArrayList<Vara> getVaras() {
        return varas;
    }

    public void setVaras(ArrayList<Vara> varas) {
        this.varas = varas;
    }

    public void addVara(Vara v){
        getVaras().add(v);
    }

    @Override
    public String toString() {
	    return "Tribunal: " + "\nNome: " + getNome() +  "\nUF: " + getUf() + "\nNúmero: " + getNumero() + '\n';
    }
}
