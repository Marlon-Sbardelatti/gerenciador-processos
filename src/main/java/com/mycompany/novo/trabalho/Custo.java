/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Custo {
    private Date data;
    private String descricao;
    private double valor;

    public Custo(Date data, String descricao, double valor) {
        setData(data);
        setDescricao(descricao);
        setValor(valor);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
	    if (data == null) {
		   throw new IllegalArgumentException("Data do custo não pode ser nulo.");
	    }
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
	    if (descricao == null || descricao.isEmpty()) {
		   throw new IllegalArgumentException("Descrição do Custo não pode ser vazio ou nulo.");
	    }
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
	    if (valor < 0) {
		   throw new IllegalArgumentException("Valor do Custo não pode ser menor que zero.");
	    }
        this.valor = valor;
    }

    @Override
    public String toString() {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    DecimalFormat df = new DecimalFormat("0.00");
	    String dataStr = sdf.format(getData());
	    return "Data: " + dataStr + " Descrição: " + getDescricao() + "\nValor: " + df.format(getValor());
    }
}
