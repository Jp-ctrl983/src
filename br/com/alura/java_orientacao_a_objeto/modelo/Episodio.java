package br.com.alura.java_orientacao_a_objeto.modelo;

import br.alura.java_orientacao_a_objeto.calculo.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Series serie;
    private int totalvil;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalvil() {
        return totalvil;
    }

    public void setTotalvil(int totalvil) {
        this.totalvil = totalvil;
    }

    @Override
    public int getClassificacao() {
        if(totalvil > 100) {
            return 4;
        }else {
            return 2;
        }
    }
}
