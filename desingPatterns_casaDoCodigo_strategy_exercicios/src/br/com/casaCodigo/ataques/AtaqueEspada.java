package br.com.casaCodigo.ataques;

import br.com.casaCodigo.interfaces.IAtaque;

public class AtaqueEspada implements IAtaque{

	private String nome;
	
    public AtaqueEspada(String nome) {
    	this.nome=nome;
	}

	@Override
    public void executarAtaque(){
        System.out.println("Personagem >> "+nome+" >> Ataque Golpe de espada realizado...");
    }


}
