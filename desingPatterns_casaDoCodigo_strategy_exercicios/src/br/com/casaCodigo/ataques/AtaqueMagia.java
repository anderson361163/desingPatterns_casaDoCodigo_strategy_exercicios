package br.com.casaCodigo.ataques;

import br.com.casaCodigo.interfaces.IAtaque;

public class AtaqueMagia implements IAtaque {

	private String nome;
	
	public AtaqueMagia(String nome) {
		this.nome = nome;
	}

	@Override
	public void executarAtaque() {
		System.out.println("Personagem >> "+nome+" >> Jogou poção mágica...");

	}

}
