package br.com.stefanini.provaqum.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prova {

	
	private List<Pergunta> perguntas;
	private Double notaAluno;
	
	public Prova() {
		super();
	}

	public Prova(List<Pergunta> perguntas, Double notaAluno) {
		super();
		this.perguntas = perguntas;
		this.notaAluno = notaAluno;
	}

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public Double getNotaAluno() {
		return notaAluno;
	}

	public void setNotaAluno(Double notaAluno) {
		this.notaAluno = notaAluno;
	}
	
	public List<Pergunta> addLista(Pergunta pergunta){
		if(perguntas == null) {
			perguntas = new ArrayList<>();
		}
		perguntas.add(pergunta);
		return perguntas;
	}
	
	public static void main(String[] args) {
		List<Pergunta> perguntas = new ArrayList<>();
		List<Boolean> respostas = new ArrayList<>();
		Pergunta pergunta = new Pergunta("Qual é a cor do Céu?","Vermelho","Rosa","Azul","Amarelo",'C');
		Pergunta pergunta2 = new Pergunta("Qual é o maior clube do Mundo?","Barcelona","Manchester United","Al Hilal","Mengão",'D');
		perguntas.add(pergunta);
		perguntas.add(pergunta2);
		
		Scanner sc = new Scanner(System.in);
		Character respostaDoUsuario;
		Boolean respostaCerta;
		
		for(Pergunta p : perguntas) {
			System.out.println(p);
			System.out.println();
			System.out.println("Resposta: ");
			respostaDoUsuario = sc.nextLine().charAt(0);
			
			if(respostaDoUsuario.equals(p.getGabarito())) {
				System.out.println("Parabéns, você acertou!");
				respostaCerta = true;
			}else {
				System.out.println("Que pena, você errou!\n");
				respostaCerta = false;
			}
			
			respostas.add(respostaCerta);
		}
		
	}
}
