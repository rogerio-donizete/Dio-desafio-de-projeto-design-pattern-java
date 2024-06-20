package transportadora;

import service.Frete;
import service.TipoFrete;

import java.util.Scanner;

/**
 * Calcula Frete baseado no designPattern Strategu, substituindo o if, else if.
 */
public class CalculaFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a distancia do frete: ");
        int distancia = scanner.nextInt();
        System.out.print("Escolha a opção de frete. \n[Digite: 1] Entrega Normal. \n[Digite: 2] Entrega Expresa" +
                "\n[Digite: 3] Entrega Agendada \n -> ");
        int opcaoFrete = scanner.nextInt();
        TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];


        Frete frete = tipoFrete.obterFrete();
        double preco =  frete.calcularPreco(distancia);
        System.out.printf("O valor total do frete é de R$%.2f", preco);

    }

}
