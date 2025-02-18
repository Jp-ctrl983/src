package br.alura.java_orientacao_a_objeto.calculo;

public class Recomendacao {
    private String recomendação;

    public void filtra(Classificacao clacificavel) {
        if (clacificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (clacificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        }else {
            System.out.println("Coloque na sua lista para assistir dps!");
        }
    }
}
