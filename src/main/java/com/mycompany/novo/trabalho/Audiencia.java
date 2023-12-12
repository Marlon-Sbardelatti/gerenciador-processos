/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.novo.trabalho;

/**
 *
 * @author hetzwga
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audiencia {
    private Date data;
    private String recomendacao;

    public Audiencia(Date data, String recomendacao) {
        setData(data);
        setRecomendacao(recomendacao);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
	    if (data == null) {
		   throw new IllegalArgumentException("Data da audiencia não pode ser nulo.");
	    }
        this.data = data;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
	    if (recomendacao == null || recomendacao.isEmpty()) {
		   throw new IllegalArgumentException("Recomendação da audiencia não pode ser vazio ou nulo.");
	    }
        this.recomendacao = recomendacao;
    }

    @Override
    public String toString() {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    String dataStr = sdf.format(getData());
	    return "Data: " + dataStr + " Recomendação: " + getRecomendacao();
    }
}
