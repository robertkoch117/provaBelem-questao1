package br.com.stefanini.provaqum.controller;

import java.util.List;
import java.util.Scanner;

import br.com.stefanini.provaqum.entities.Pergunta;
import br.com.stefanini.provaqum.util.UsuarioValidate;

public class PerguntaController {

	public List<Boolean> lerPerguntas(List<Pergunta> perguntas, List<Boolean> respostas, Scanner sc) {
		
		Character respostaDoUsuario;
		Boolean respostaCerta;
		
		for(Pergunta p : perguntas) {
			System.out.println(p);
			System.out.println();
			System.out.println("Resposta: ");
			respostaDoUsuario = sc.next().charAt(0);
			
			UsuarioValidate uv = new UsuarioValidate();
			while(!uv.isOpcaoString(Character.toString(respostaDoUsuario))) {
				System.out.println("Voc� inseriu um d�gito incorreto.");
				System.out.println("Digite um dos d�gitos v�lidos a seguir: A, B, C, ou D");
				System.out.println(p);
				respostaDoUsuario = sc.next().charAt(0);
			}
			
			respostaDoUsuario = Character.toUpperCase(respostaDoUsuario);
			
			if(respostaDoUsuario.equals(p.getGabarito())) {
				System.out.println("Parab�ns, voc� acertou!\n");
				System.out.println("\n================================\n");
				respostaCerta = true;
			}else {
				System.out.println("Que pena, voc� errou!\n");
				System.out.println("\n================================\n");
				respostaCerta = false;
			}
			
			respostas.add(respostaCerta);
		}
		return respostas;
	}
}
