
import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Disco> discos;


    public Catalogo() {
        this.discos = new ArrayList<>();
    }


    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }


    public void mostrarDiscos() {
        System.out.println("Discos disponiveis: \n");
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
            if (disco.getNome().equals(nomeDisco)) {
                discos.remove(disco);
                System.out.println("Disco \"" + nomeDisco + "\" removido do catálogo.");
                return;
            }
        }
        System.out.println("Disco não encontrado.");
    }
}
