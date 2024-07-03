package br.com.casaCodigo.model;

import br.com.casaCodigo.interfaces.IAtaque;

public class Personagem {

	private String nome;
	private int vida;
	private IAtaque ataque;

	public Personagem(String nome, int vida, IAtaque ataque) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		System.out.println("Personagem >> " + nome +" >> Surgiu");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void executarAtaque() {
		ataque.executarAtaque();
	}

	public void setAtaque(IAtaque ataque) {
		this.ataque = ataque;
	}

}