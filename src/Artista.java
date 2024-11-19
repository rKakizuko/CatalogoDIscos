import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Artista {
    protected String nome;
    protected String generoMusical;
    protected List<Disco> discos;


    public Artista(String nome, String generoMusical) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.discos = new ArrayList<>(); // Inicializando a lista de discos
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeDiscos() {
        return discos.size();
    }


    public void adicionarDisco(Disco disco) {
        if (!discos.contains(disco)) {
            discos.add(disco);
            System.out.println("Disco \"" + disco.getNome() + "\" adicionado ao artista \"" + nome + "\".");
        } else {
            System.out.println("O disco \"" + disco.getNome() + "\" já está associado ao artista \"" + nome + "\".");
        }
    }


    public void removerDisco(Disco disco) {
        if (discos.remove(disco)) {
            System.out.println("Disco \"" + disco.getNome() + "\" removido do artista " + nome + ".");
        } else {
            System.out.println("O disco \"" + disco.getNome() + "\" não está associado ao artista " + nome + "\".");
        }
    }


    public List<Disco> getDiscos() {
        return Collections.unmodifiableList(discos);
    }

    @Override
    public String toString() {
        return "\n------------------------------------------" +
                "\nArtista: " + nome + "\n" +
                "Genero musical: " + generoMusical +
                "\n discos(" + getNumeroDeDiscos()+ "):" + discos +
                "\n------------------------------------------";
    }
}