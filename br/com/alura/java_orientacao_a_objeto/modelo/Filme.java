package br.com.alura.java_orientacao_a_objeto.modelo;
import br.alura.java_orientacao_a_objeto.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public Filme(String nome, int anoDelançamento) {
        super(nome, anoDelançamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia()  / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " Ano de lançamento: (" + this.getAnoDelançamento() + ")";
    }
}
