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

public class Processo {
    private boolean emAberto;
    private int codigo;
    private String motivo;
    private Advogado advogado;
    private Secretaria secretaria;
    private Pessoa cliente;
    private Pessoa parteOposta;
    private ArrayList<Custo> custos;
    private ArrayList<Audiencia> audiencias;

    public Processo(boolean emAberto, int codigo, String motivo, Advogado advogado, Secretaria secretaria, Pessoa cliente, Pessoa parteOposta) {
	    setEmAberto(emAberto);
	    setCodigo(codigo);
	    setMotivo(motivo);
	    setAdvogado(advogado);
	    setSecretaria(secretaria);
	    setCliente(cliente);
	    setParteOposta(parteOposta);
	    custos = new ArrayList<>();
	    audiencias = new ArrayList<>();
    }

    public boolean isEmAberto() {
        return emAberto;
    }

    public void setEmAberto(boolean emAberto) {
        this.emAberto = emAberto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
	    if (codigo <= 0 ) {
		   throw new IllegalArgumentException("Código do processo não pode ser menor ou igual a zero.");
	    }
        this.codigo = codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
	    if (motivo == null || motivo.isEmpty()) {
		   throw new IllegalArgumentException("Motivo do processo não pode ser vazio ou nulo.");
	    }
        this.motivo = motivo;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
	    if (advogado == null) {
		   throw new IllegalArgumentException("Advogado do processo não pode ser nulo.");
	    }
        this.advogado = advogado;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
	    if (secretaria == null) {
		   throw new IllegalArgumentException("Secretaria do processo não pode ser nulo.");
	    }
        this.secretaria = secretaria;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
	    if (cliente == null) {
		    throw new IllegalArgumentException("Cliente do processo não pode ser nulo.");
	    }
        this.cliente = cliente;
    }

    public Pessoa getParteOposta() {
        return parteOposta;
    }

    public void setParteOposta(Pessoa parteOposta) {
	    if (parteOposta == null) {
		   throw new IllegalArgumentException("Parte oposta do processo não pode ser nulo.");
	    }
        this.parteOposta = parteOposta;
    }


    public ArrayList<Custo> getCustos() {
        return custos;
    }

    public void setCustos(ArrayList<Custo> custos) {
        this.custos = custos;
    }

    public ArrayList<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(ArrayList<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }

    public void addCusto(Custo c){
        getCustos().add(c);
    }
    public void addAudiencia(Audiencia a){
        getAudiencias().add(a);
    }
    public double calcularCusto(){
        double total = 0;

        for (Custo c : getCustos()){
            total += c.getValor();
        }

        return total;
    }

	@Override
	public String toString() {
		String emAbertoStr = "";
		if (isEmAberto()) {
			emAbertoStr = "em Aberto";
		}else {
			emAbertoStr = "fechado";
		}

		String dadosAudiencias = "";

		for (Audiencia a : getAudiencias()){
			dadosAudiencias += a.toString() + '\n';
		}

		String dadosCusto = "";

		for (Custo c : getCustos()){
			dadosCusto += c.toString() + '\n';
		}
		return "Código Processo: " + getCodigo() + "\nStatus: " + emAbertoStr + "\nMotivo: " + getMotivo() + "\n\nAdvogado:\n" + getAdvogado().toString()+
			 "\n\nSecretaria:\n" + getSecretaria().toString() + 
			"\n\nCliente: \n" + getCliente().toString() + "\nParte Oposta: \n" + getParteOposta().toString() + "\nCustos:\n" + dadosCusto + 
			"\nAudiencias: \n" + dadosAudiencias;
	}
    
}