package org.example.POO.Desafio.br.com.alura.minhasmusicas.principal;

import org.example.POO.Desafio.br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import org.example.POO.Desafio.br.com.alura.minhasmusicas.modelos.Musica;
import org.example.POO.Desafio.br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("I was made for loving you");
        minhaMusica.setCantor("Kiss");

        for(int i=0 ; i<1000 ; i++){
            minhaMusica.reproduz();
        }

        for(int i=0 ; i<50 ; i++){
            minhaMusica.curtidas();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Matheus Negrini");

        for(int i=0 ; i<1000 ; i++){
            meuPodcast.reproduz();
        }

        for(int i=0 ; i<50 ; i++){
            meuPodcast.curtidas();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }

}
