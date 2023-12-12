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

public class Vara {
    private String nome;
    private int num;

    private ArrayList<Processo> processos;

    public Vara(String nome, int num) {
        setNome(nome);
        setNum(num);
        processos = new ArrayList<>();
    }

    public ArrayList<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(ArrayList<Processo> processos) {
        this.processos = processos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
	    if (nome == null || nome.isEmpty()) {
		   throw new IllegalArgumentException("Nome da Vara não pode ser nulo ou vazio.");
	    }
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
	    if (num <= 0 ) {
		   throw new IllegalArgumentException("Número da Vara não pode ser menor ou igual a zero.");
	    }
        this.num = num;
    }

    public void addProcesso(Processo p){
       getProcessos().add(p);
    }

	@Override
	public String toString() {
		return "Vara: " + "\nNome: " +getNome() + "\nNúmero: " + getNum() + '\n';
	}



}
