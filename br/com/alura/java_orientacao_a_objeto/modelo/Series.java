package br.com.alura.java_orientacao_a_objeto.modelo;

public class Series extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minPorepisodios;

    public Series(String nome, int anoDelançamento) {
        super(nome, anoDelançamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinPorepisodios() {
        return minPorepisodios;
    }

    public void setMinPorepisodios(int minPorepisodios) {
        this.minPorepisodios = minPorepisodios;
    }

    @Override
    public int getDuraçãoEmMinuto() {
        return temporadas * episodiosPorTemporada * minPorepisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + getNome() + " Com o ano de lançamento: " + getAnoDelançamento();
    }
}