package Questao04;

import java.util.Scanner;

public class Empresa{
    public static void main(String[] args){
        float quantidadeDinheiro, precoUnidade, valorTotal, parcela;
        int quantidadeProdutos;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro no caixa da empresa: ");
        quantidadeDinheiro = teclado.nextFloat();
        System.out.print("Digite a quantidade de produtos a ser comprada: ");
        quantidadeProdutos = teclado.nextInt();
        System.out.print("Digite o preço de cada unidade do produto: ");
        precoUnidade = teclado.nextFloat();

        valorTotal = precoUnidade * quantidadeProdutos;

        if(valorTotal > 0.8 * quantidadeDinheiro) {
            valorTotal = 1.1f * valorTotal;
            parcela = valorTotal/3;
            System.out.println("Aplicando os 10% de juros sobre a compra dos produtos");
            System.out.print("O valor total a pagar é: " + valorTotal + " em 3 parcelas de " + parcela + " reais");
        }
        else{
            valorTotal = 0.95f * valorTotal;
            System.out.println("Aplicando os 5% de desconto sobre a compra dos produtos");
            System.out.print("O valor total a pagar é: " + valorTotal + " reais à vista");
        }
    }
}