package br.principal;

import br.alura.java_orientacao_a_objeto.calculo.CalculadoraDeTempo;
import br.alura.java_orientacao_a_objeto.calculo.Recomendacao;
import br.com.alura.java_orientacao_a_objeto.modelo.Episodio;
import br.com.alura.java_orientacao_a_objeto.modelo.Filme;
import br.com.alura.java_orientacao_a_objeto.modelo.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Test Comentario

        Filme meuFilme = new Filme("Vingadores Gerra Infinita", 2019);

        meuFilme.setDuraçãoEmMinuto(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.fichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliação());
        System.out.println("Media das avaliações: " + meuFilme.retornaMedia());

        Series minhaSerie = new Series(("Perdidos no espaço"), 2020);

        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.getDuraçãoEmMinuto();

        minhaSerie.fichaTecnica();

        minhaSerie.setMinPorepisodios(32);
        minhaSerie.setTemporadas(3);
        minhaSerie.setEpisodiosPorTemporada(10);

        System.out.println("Duração em minutos para maratonar a serie: " + minhaSerie.getDuraçãoEmMinuto());

        Filme segundoFilme = new Filme("Poderoso chefinho", 2018);
        segundoFilme.setDuraçãoEmMinuto(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(segundoFilme);

        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal() + " mim.");

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(meuFilme);

        segundoFilme.fichaTecnica();

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalvil(300);

        recomendacao.filtra(episodio);

        var filmeDeJoao = new Filme("Maze Runner Scorch trials", 2015);

        filmeDeJoao.setNome("Maze Runner Scorch trials");
        filmeDeJoao.setDuraçãoEmMinuto(200);
        filmeDeJoao.avalia(10);
        filmeDeJoao.avalia(10);
        filmeDeJoao.avalia(10);

        //o ArrayList<Filme> ira fazer uma lista de filmes que estao no objeto
        ArrayList<Filme> listaDeFilme = new ArrayList<>();

        listaDeFilme.add(filmeDeJoao);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(segundoFilme);

        //O .size() e para saber o tamanho array como o length e count
        System.out.println("A quantidade de filme add foi " + listaDeFilme.size());
        //get e para dizer a posição de onde esta o primeiro filme
        System.out.println("O primeiro filme e o: " + listaDeFilme.get(0).getNome());
        System.out.println("Os filmes são: \n" + listaDeFilme);
        System.out.println("tostring do filme: " + listaDeFilme.get(0).toString());

    }
}