package br.com.matheusnegrini.screenmatch.modelos;

import br.com.matheusnegrini.screenmatch.calculo.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private java.lang.String nome;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
         if (totalDeVisualizacoes > 100){
             return 4;
         }else {
             return 5;
         }
    }

    public void setSerie(java.lang.String theOffice) {
    }
}
