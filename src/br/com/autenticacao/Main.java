package br.com.autenticacao;

import br.com.autenticacao.controller.UsuarioController;
import br.com.autenticacao.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		UsuarioController controller = new UsuarioController();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Janaina");
		usuario.setEmail("janay@rhcp.com");
		usuario.setSenha("jan123");
		usuario.setIsAtivo(true);
		
		controller.cadastrar(usuario);
	}

}
