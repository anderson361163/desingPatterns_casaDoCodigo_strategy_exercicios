package br.com.casaCodigo.AtaquesPossiveis;

public class AtaqueEspada implements IAtaque{

    @Override
    public void atacar(Ataque ataque){
        System.out.println("Golpe de espada realizado...");
    }


}