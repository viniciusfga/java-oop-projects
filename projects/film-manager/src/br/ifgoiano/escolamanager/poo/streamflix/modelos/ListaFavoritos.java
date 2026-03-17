package br.ifgoiano.escolamanager.poo.streamflix.modelos;
import java.util.ArrayList;
import java.util.List;

public class ListaFavoritos {

    private List<Titulo> favoritos;

    public ListaFavoritos() {
        this.favoritos = new ArrayList<>();
    }

    // Adiciona um novo título à lista
    public void adiciona(Titulo titulo) {
        if (!favoritos.contains(titulo)) {
            favoritos.add(titulo);
            System.out.println("✅ " + titulo.getNome() + " foi adicionado aos favoritos!");
        } else {
            System.out.println("⚠️ " + titulo.getNome() + " já está na lista de favoritos!");
        }
    }

    // Exibe todos os títulos favoritos
    public void exibirFavoritos() {
        System.out.println("\n🎞️ Meus Favoritos:");
        for (Titulo titulo : favoritos) {
            System.out.println("- " + titulo.getNome() + " (" + titulo.getAnoDeLancamento() + ")");
        }
    }

    // Retorna a lista (caso precise usar em outra classe)
    public List<Titulo> getFavoritos() {
        return favoritos;
    }
}

