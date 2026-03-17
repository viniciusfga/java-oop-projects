package br.ifgoiano.escolamanager.poo.streamflix.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        int nota = classificavel.getClassificacao();
        if (nota >= 4) {
            System.out.println("Recomendado: muito bem avaliado ⭐");
        } else if (nota >= 2) {
            System.out.println("Recomendado: razoável 👍");
        } else {
            System.out.println("Não recomendado 👎");
        }
    }
}
