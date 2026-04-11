package AtividadesModulo1;

public class Main {
    public static void main(String[] args) {

        //ExemploCalculadora
        double resultado = Calculadora.calculaDobro(10.5); // Chamando o método
        System.out.println("O dobro é: " + resultado);

        //ExemploMusica
        Musica musica1 = new Musica();
        musica1.titulo = "Like a stone";
        musica1.banda = "Audioslave";
        musica1.anoLancamento = 2003;
        musica1.avaliarMusica(9);
        musica1.avaliarMusica(9.5);
        musica1.avaliarMusica(9.8);
        musica1.exibeFichaTecnica();

        //ExemploCarrro
        Carro gm1 = new Carro();
        gm1.modelo = "Corsa Classic";
        gm1.cor = "Prata";
        gm1.ano = 2009;
        gm1.exibirFichaTecnica();
    }
}
