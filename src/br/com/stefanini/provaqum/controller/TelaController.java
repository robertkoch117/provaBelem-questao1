package br.com.stefanini.provaqum.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.stefanini.provaqum.view.Tela;

public class TelaController {
	private Integer opcao;

	public String apresentacao(Scanner sc) {
		System.out.println("Olá, qual é o seu nome? ");
		String nome = sc.nextLine();
		return nome;
	}

	public void chamarComponentes(String nome) throws InputMismatchException{
			Tela tela = new Tela(nome);
			tela.gerarTela();
	}
	
	
	 public Integer opcaoDigitadaPeloUsuario(Scanner sc) {
		 this.opcao = sc.nextInt();
		 return opcao;
	 }
	 
	
	public void escolhaDoUsuario(Scanner sc) throws NullPointerException{
		switch(opcao) {
		case 1:
			System.out.println("A Opção 1 foi a escolhida.\n");
			break;
		case 2:
			System.out.println("A Opção 2 foi a escolhida.\n");
			break;
		case 3:
			System.out.println("A Opção 3 foi a escolhida.\n");
			ProvaController pcontroller = new ProvaController();
			int nota = pcontroller.gerarProva(sc);
			System.out.println("Sua nota final é: " + nota+"\n");
			if(nota == 5) {
				System.out.println("Parabéns, você gabaritou a prova!\n");
			}
			break;
		case 4:
			System.out.println("O Programa será encerrado.");
			System.exit(0);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

}
