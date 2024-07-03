package br.com.casaCodigo.model;

public class Personagem{

    private String nome;
    private String vida;
    private IAtaque ataque;

    public Personagem(){
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getVida(){
        return this.vida;
    }

    public void setVida(String vida){
        this.vida=vida;
    }

    public Ataque getAtaque(){
        return this.ataque;
    }

    public void setAtaque(IAtaque ataque){
        this.ataque=ataque;
    }

}