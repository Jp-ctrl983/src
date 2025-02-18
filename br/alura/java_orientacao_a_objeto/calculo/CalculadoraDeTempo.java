package br.alura.java_orientacao_a_objeto.calculo;

import br.com.alura.java_orientacao_a_objeto.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuraçãoEmMinuto();
    }
}
