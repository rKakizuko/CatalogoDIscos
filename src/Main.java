
public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Artista TylerTC = new Artista("Tyler, the Creator", "Rap, Hip-Hop");
        Disco Chromakopia = new Disco("Chromakopia", 2024,TylerTC);
        Chromakopia.adicionarFaixa("Chromakopia");
        Chromakopia.adicionarFaixa("Rah Tah Tah");
        Chromakopia.adicionarFaixa("Darling,I");
        TylerTC.adicionarDisco(Chromakopia);
        catalogo.adicionarDisco(Chromakopia);

        Artista SuiseiH = new Artista("Hoshimachi Suisei", "JPop, JRap");
        Disco StillStillStellar = new Disco("Still Still Stellar", 2021, SuiseiH);
        StillStillStellar.adicionarFaixa("Still Still Stellar");
        StillStillStellar.adicionarFaixa("Je t\'aime");
        StillStillStellar.adicionarFaixa("GHOST - Still Still Stellar ver.");
        SuiseiH.adicionarDisco(StillStillStellar);
        catalogo.adicionarDisco(StillStillStellar);

        catalogo.mostrarDiscos();
        System.out.println(SuiseiH);
        TylerTC.setGeneroMusical("Rap");
        StillStillStellar.setAnoDeLancamento(2020);
        System.out.println(TylerTC);
        catalogo.removerDisco("Chromakopia");
        catalogo.mostrarDiscos();



        }
}