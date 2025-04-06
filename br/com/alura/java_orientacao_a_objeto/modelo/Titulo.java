package br.com.alura.java_orientacao_a_objeto.modelo;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    public String nome;
    @SerializedName("Year")
    public int anoDelançamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliação;
    private int TotalDeAvaliação;
    public int duraçãoEmMinuto;

    @SerializedName("Genre")
    public String genere;

    @SerializedName("Runtime")
    public String RunTime;

    public Titulo(String nome, int anoDelançamento) {
        this.nome = nome;
        this.anoDelançamento = anoDelançamento;
    }

    public int getTotalDeAvaliação() {
        return TotalDeAvaliação;
    }

    public int getDuraçãoEmMinuto() {
        return duraçãoEmMinuto;
    }

    public void setDuraçãoEmMinuto(int duraçãoEmMinuto) {
        this.duraçãoEmMinuto = duraçãoEmMinuto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDelançamento(int anoDelançamento) {
        this.anoDelançamento = anoDelançamento;
    }

    public int getAnoDelançamento() {
        return anoDelançamento;
    }

    public void fichaTecnica() {
        System.out.println("O nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDelançamento);
        System.out.println("Duração em minuto: " + duraçãoEmMinuto);
        System.out.println("Vc esta incluido no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliação += nota;
        TotalDeAvaliação++;
    }

    //metodo double
    public double retornaMedia() {
        return somaDasAvaliação / TotalDeAvaliação;
    }

    @Override
    public int compareTo(Titulo nome) {
        return this.getNome().compareTo(nome.getNome());
    }

    @Override
    public String toString() {
        return "nome:" + nome + " e anoDelançamento: " + anoDelançamento + " O tempo e de: " + this.RunTime + " O seu genero e: " + this.genere;
    }
}
