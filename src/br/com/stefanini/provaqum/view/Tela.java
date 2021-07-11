package br.com.stefanini.provaqum.view;

public class Tela {
	private Integer opcaoEscolhida;
	private String nome;
	
	public Tela(String nome){
		this.nome = nome;
	}

	public Integer getOpcaoEscolhida() {
		return opcaoEscolhida;
	}

	public void setOpcaoEscolhida(Integer opcaoEscolhida) {
		this.opcaoEscolhida = opcaoEscolhida;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void gerarTela(){
		System.out.println("         Olá, " + nome + "! 	");
		System.out.println("================================");
		
		System.out.println("|    Qual opção você deseja?   |");
		System.out.println("|  1 - Criar uma pergunta      | ");
		System.out.println("|  2 - Criar uma prova         | ");
		System.out.println("|  3 - Responder uma prova     |");
		System.out.println("|  4 - Sair                    |");
		System.out.println("================================\n");
	}
}
