package br.com.matheusnegrini.screenmatch.modelos;

import br.com.matheusnegrini.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private Serie diretor;

    public Serie getDiretor() {
        return diretor;
    }

    public void setDiretor(Serie diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) somaMedia()/2;
    }
}
