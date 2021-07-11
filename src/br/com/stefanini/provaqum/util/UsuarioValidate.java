package br.com.stefanini.provaqum.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidate {
	
	public Boolean isOpcaoString(String opcao) {
		Pattern p = Pattern.compile("[a-dA-D]{1}");
		Matcher m = p.matcher(opcao);
		return m.matches();
	}
	
	public Boolean isOpcaoInt(int opcao) {
		if((opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4)) {
			return false;
		}else {
			return true;
		}
	}
	
	public Boolean isNome(String nome) {
		Pattern p = Pattern.compile("[a-zA-z]{2,10}");
		Matcher m = p.matcher(nome);
		return m.matches();			
	}
	
}
