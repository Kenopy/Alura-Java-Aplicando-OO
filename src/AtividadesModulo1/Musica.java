package AtividadesModulo1;

public class Musica {
    String titulo;
    String banda;
    int anoLancamento;
    double avaliacao;
    int numAavaliacoes;

    double calculaMedia(){
        return avaliacao/numAavaliacoes;
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAavaliacoes++;
    }
    void exibeFichaTecnica(){
        System.out.println("A música "+titulo+" é da banda "+banda+", foi lançada em "+anoLancamento+", e atualmente está avaliada com a nota "+calculaMedia()+".");
    }
}
