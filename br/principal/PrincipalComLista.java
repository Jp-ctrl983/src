package br.principal;

import br.com.alura.java_orientacao_a_objeto.modelo.Filme;
import br.com.alura.java_orientacao_a_objeto.modelo.Series;
import br.com.alura.java_orientacao_a_objeto.modelo.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Cidade de Deus ", 2019);

        meuFilme.avalia(8);

        Filme filmeDeJoao = new Filme("Blade Runner", 2015);

        filmeDeJoao.avalia(9);

        Filme segundoFilme = new Filme("A Chegada", 2016);

        segundoFilme.avalia(10);

        Series minhaSerie = new Series(("De volta para o futuro"), 1985);

        minhaSerie.avalia(6);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDeJoao);
        lista.add(meuFilme);
        lista.add(segundoFilme);
        lista.add(minhaSerie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                if (filme.getClassificacao() > 2) {
                    System.out.println("Classificação: " + filme.getClassificacao());
                }
            }

        }

        List<String> buscaArtista = new LinkedList<>();

        buscaArtista.add("TheRook");
        buscaArtista.add("Will Smit");
        buscaArtista.add("Ton Roland");

        System.out.println(buscaArtista);

        //Para colocar em ordem alfabetica
        Collections.sort(buscaArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaArtista);

        System.out.println("\n\n");

        //ler oarquivo Titulo como o metod public int compareTo(Titulo nome)
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("\n\n");
        //Forma de comparação por meio do ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDelançamento));

        System.out.println(lista);
    }
}