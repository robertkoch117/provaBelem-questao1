package br.com.stefanini.provaqum.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.stefanini.provaqum.entities.Usuario;
import br.com.stefanini.provaqum.util.UsuarioValidate;

public class Main {

	public static void main(String[] args) {
		
		try{
			TelaController tController = new TelaController();
			UsuarioValidate uv = new UsuarioValidate();
			
			Scanner sc = new Scanner(System.in);
			
			Usuario usuario = new Usuario(tController.apresentacao(sc));
			while(!uv.isNome(usuario.getNome())) {
				System.out.println("Digite um nome válido.\n");
				usuario = new Usuario(tController.apresentacao(sc));
			}
			
			tController.chamarComponentes(usuario.getNome());
			int opcao = tController.opcaoDigitadaPeloUsuario(sc);
			
			while(!uv.isOpcaoInt(opcao)) {
				System.out.println("*******************************************************");
				System.out.println("\nInsira novamente.");
				System.out.println("É necessário inserir um dígito válido: 1, 2, 3, ou 4\n");
				System.out.println("*******************************************************");
				tController.chamarComponentes(usuario.getNome());
				opcao = tController.opcaoDigitadaPeloUsuario(sc);
			}
			
			tController.escolhaDoUsuario(sc);
			sc.close();
			
			System.out.println("Fim do Programa");
		}catch(InputMismatchException e) {
			System.out.println("Insira um número válido (1, 2, 3 ou 4)");
		}
		
	}

}
