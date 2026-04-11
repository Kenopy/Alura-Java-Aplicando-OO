package AtividadesModulo1;

import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo + ", sua cor é " + cor + " e tem "+ calcularIdadeCarro() + " anos de idade.");
    }
    int calcularIdadeCarro(){
       int anoAtual = LocalDate.now().getYear();
       return anoAtual-ano;
    }
}
