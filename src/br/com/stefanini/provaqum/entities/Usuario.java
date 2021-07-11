package br.com.stefanini.provaqum.entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private double notaFinal;
	private List<Boolean> respostas;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public List<Boolean> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Boolean> respostas) {
		this.respostas = respostas;
	}
	
	public List<Boolean> addLista(Boolean resposta){
		if(respostas == null) {
			respostas = new ArrayList<>();
		}
		respostas.add(resposta);
		return respostas;
	}
	
	
}
