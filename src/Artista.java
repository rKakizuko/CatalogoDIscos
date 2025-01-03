import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Artista {
    private String nome;
    private String generoMusical;
    private List<Disco> discos;


    public Artista(String nome, String generoMusical) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.discos = new ArrayList<>();
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