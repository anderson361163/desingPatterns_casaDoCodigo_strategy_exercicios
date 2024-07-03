package br.com.casaCodigo;

import br.com.casaCodigo.ataques.AtaqueEspada;
import br.com.casaCodigo.ataques.AtaqueMagia;
import br.com.casaCodigo.interfaces.IAtaque;
import br.com.casaCodigo.model.Personagem;

public class Principal{

    public static void main(String[] args){
    	System.out.println("----------------------------");
    	System.out.println("O mundo de Hobbit");
    	System.out.println("----------------------------");
    	
    	IAtaque ataqueMagia = new AtaqueMagia("Gandalf");
        Personagem personagem1 = new Personagem("Gandalf", 100, ataqueMagia);

        personagem1.executarAtaque();
        
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        
    	IAtaque ataqueEspada = new AtaqueEspada("Rei Arthur");
        Personagem personagem2 = new Personagem("Rei Arthur", 100, ataqueEspada);

        personagem2.executarAtaque();
        
        System.out.println("----------------------------");
        
    }

}
