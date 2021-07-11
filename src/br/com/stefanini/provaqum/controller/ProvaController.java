package br.com.stefanini.provaqum.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.stefanini.provaqum.entities.Pergunta;

public class ProvaController {
	
	List<Pergunta> perguntas = new ArrayList<>();
	List<Boolean> respostas;
	
	public int gerarProva(Scanner sc) {
		respostas = new ArrayList<>(); 
		respostas = gerarPerguntasPreDefinidas(sc);
		return calcularNota(respostas);
	}
	
	public List<Boolean> gerarPerguntasPreDefinidas(Scanner sc) {
		List<Pergunta> perguntas = new ArrayList<>();
		List<Boolean> respostas = new ArrayList<>();
		
		Pergunta pergunta1 = new Pergunta("\nQual desses não é um tipo primitivo em Java?","int","double","bule","float",'C');
		Pergunta pergunta2 = new Pergunta("\nO que é uma classe Wrapper?","Uma classe que cria fotos","Uma classe que roda programas em thread.","Uma classe que não é Trapper.","Uma classe com o objetivo de abrigar\n os tipos primitivos existentes no Java",'D');
		Pergunta pergunta3 = new Pergunta("\nQual é o significado da sigla JDBC?","Jota Dê Bê Cê","Java Dictionary Connectivity","Java Database Connectivity","Java Driver Connection",'C');
		Pergunta pergunta4 = new Pergunta("\nO que é Java?","Uma ilha da indonésia","Uma linguagem de programação","Um tipo de café","Todas as alternativas anteriores",'D');
		Pergunta pergunta5 = new Pergunta("\nQuem foi o criador da linguagem Java?","James Gosling","Edson Belem","Ryan Gosling","Luciana Medeiros",'A');
		
		perguntas.add(pergunta1);
		perguntas.add(pergunta2);
		perguntas.add(pergunta3);
		perguntas.add(pergunta4);
		perguntas.add(pergunta5);
		
		PerguntaController perguntaController = new PerguntaController();
		respostas = perguntaController.lerPerguntas(perguntas,respostas,sc);
		
		return respostas;
	}
	
	public int calcularNota(List<Boolean> respostas) {
		int nota=0;
		for(Boolean resposta : respostas) {
			if(resposta) {
				nota++;
			}
		}
		return nota;
	}
}
