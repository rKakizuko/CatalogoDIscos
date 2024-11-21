import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Disco> discos;
    private List<Artista> artistas;

    public Catalogo() {
        this.discos = new ArrayList<>();
        this.artistas = new ArrayList<>();
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public void mostrarDiscos() {
        System.out.println("Discos disponíveis: \n");
        if (discos.isEmpty()) {
            System.out.println("Não há discos no catálogo.");
            return;
        }

        for (Disco disco : discos) {
            System.out.println("Disco: " + disco.getNome());
            System.out.println("Ano de Lançamento: " + disco.getAnoDeLancamento());
            System.out.println("Número de Faixas: " + disco.getNumeroDeFaixas());
            System.out.println("Faixas: " + disco.getFaixas());
            System.out.println("Artista: " + disco.getArtista().getNome());
            System.out.println("------------------------------------------");
        }
    }

    public void removerDisco(String nomeDisco) {
        for (Disco disco : discos) {
            if (disco.getNome().equalsIgnoreCase(nomeDisco)) {
                discos.remove(disco);
                System.out.println("Disco \"" + nomeDisco + "\" removido do catálogo.");
                return;
            }
        }
        System.out.println("Disco não encontrado.");
    }

    public Disco acharDisco(String nomeDisco) {
        for (Disco disco : discos) {
            if (disco.getNome().equalsIgnoreCase(nomeDisco)) {
                return disco;
            }
        }
        return null;
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void mostrarArtistas() {
        System.out.println("Artistas disponíveis: \n");
        if (artistas.isEmpty()) {
            System.out.println("Não há artistas no catálogo.");
            return;
        }

        for (Artista artista : artistas) {
            System.out.println("Artista: " + artista.getNome());
            System.out.println("Gêneros: " + artista.getGeneroMusical());
            System.out.println("Discos: ");
            for (Disco disco : artista.getDiscos()) {
                System.out.println("  - " + disco.getNome());
            }
            System.out.println("------------------------------------------");
        }
    }

    public void removerArtista(String nomeArtista) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nomeArtista)) {
                artistas.remove(artista);
                System.out.println("Artista \"" + nomeArtista + "\" removido do catálogo.");
                return;
            }
        }
        System.out.println("Artista não encontrado.");
    }

    public Artista acharArtista(String nomeArtista) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nomeArtista)) {
                return artista;
            }
        }
        return null;
    }
}
