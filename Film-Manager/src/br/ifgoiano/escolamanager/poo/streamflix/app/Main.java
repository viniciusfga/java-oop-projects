package br.ifgoiano.escolamanager.poo.streamflix.app;

import br.ifgoiano.escolamanager.poo.streamflix.modelos.Filme;
import br.ifgoiano.escolamanager.poo.streamflix.modelos.ListaFavoritos;
import br.ifgoiano.escolamanager.poo.streamflix.modelos.Serie;

public class Main {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        Filme avatar = new Filme();
        avatar.setNome("Avatar");
        avatar.setAnoDeLancamento(2023);
        avatar.setDuracaoEmMinutos(200);

        // 🩵 Cria a lista de favoritos e adiciona itens
        ListaFavoritos favoritos = new ListaFavoritos();
        favoritos.adiciona(meuFilme);
        favoritos.adiciona(lost);
        favoritos.adiciona(avatar);
        favoritos.adiciona(lost); // teste de duplicado

        // Exibe todos os favoritos
        favoritos.exibirFavoritos();

    }
}
