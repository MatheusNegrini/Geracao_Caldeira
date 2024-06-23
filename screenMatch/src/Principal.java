import br.com.matheusnegrini.screenmatch.calculo.CalculadoraDeTempo;
import br.com.matheusnegrini.screenmatch.modelos.Filme;
import br.com.matheusnegrini.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Divertidamente 2");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setDuracaoEmMinutos(125);

        meuFilme.exibirFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        
        System.out.println("Total de avaliações feitas: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println("A média da nota deste filme é: " + meuFilme.somaMedia());

        Serie theOffice = new Serie();

        theOffice.setNome("The Office");
        theOffice.setAnoDeLancamento(2010);
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(15);
        theOffice.exibirFichaTecnica();
        theOffice.setDuracaoEmMinutos(300);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(theOffice);
        System.out.println(calculadora.getTempoTotal());
    }
}
