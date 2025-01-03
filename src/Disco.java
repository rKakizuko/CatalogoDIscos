import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String nome;
    private int anoDeLancamento;
    private int numeroDeFaixas;
    private Artista artista;
    private List<String> faixas = new ArrayList<>();

    public Disco() {
    }

    public Disco(String nome, int anoDeLancamento, Artista artista) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public Artista getArtista() {
        return artista;
    }
    private void atualizarNumeroDeFaixas() {
        this.numeroDeFaixas = faixas.size();
    }
    public void adicionarFaixa(String faixa) {
        faixas.add(faixa);
        atualizarNumeroDeFaixas();
    }

    public void removerFaixa(String faixa) {
        faixas.remove(faixa);
        atualizarNumeroDeFaixas();
    }

    public List<String> getFaixas() {
        return new ArrayList<>(faixas);
    }

    @Override
    public String toString() {
        return "\n" +
                "\nDisco: " + nome + "\n" +
                "Ano de Lançamento: " + anoDeLancamento +
                "\nArtista: " + artista.getNome() +
                "\nNúmero de faixas: " + numeroDeFaixas +
                "\nFaixas: " + faixas +
                "\n";
    }
}
