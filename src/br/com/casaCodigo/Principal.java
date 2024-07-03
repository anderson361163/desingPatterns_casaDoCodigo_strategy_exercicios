package br.com.casaCodigo;

import br.com.casaCodigo.model.Personagem;
import br.com.casaCodigo.interfaces.IAtaque;
import br.com.casaCodigo.ataquesPossiveis.AtaqueMagia;
import br.com.casaCodigo.ataquesPossiveis.AtaqueEspada;

public class Principal{

    public static void main(String[] args){
        System.out.println("Hello World");

        IAtaque ataqueMagico = new AtaqueMagia();

        Personagem personagem = new Personagem();

        personagem.setNome("Hobbit");
        personagem.setVida(100);
        personagem.setAtaque(ataqueMagico);


        personagem.atacar();

    }

}