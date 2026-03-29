package Questao02;

import java.util.Scanner;

public class Main {

    static Veiculo moto = new Veiculo("Moto", 10000, 0);
    static Veiculo carro = new Veiculo("Camaro", 40000, 4);
    static Veiculo caminhao = new Veiculo("Caminhão", 80000, 2);

    static Concessionaria concessionaria = new Concessionaria("BrCarros");
    static Scanner scanner = new Scanner(System.in);

    public static void Menu(){
        concessionaria.mostrarCarrosAVenda();
    }

    public static void venderVeiculo(){
        String nome;
        int opcao, parcelas = 0;

        Menu();

        System.out.print("Digite o nome do veículo: ");
        nome = scanner.next();

        System.out.print("1. Pagamento à vista\n2. Pagamento parcelado\nOpção: ");
        opcao = scanner.nextInt();

        if(opcao == 2){
            System.out.print("Digite a quantidade de parcelas: ");
            parcelas = scanner.nextInt();
        }
        if(concessionaria.venderVeiculo(nome, opcao, parcelas))
            System.out.println("Veículo vendido com sucesso!");
        else
            System.out.println("Veículo não existe.");
    }

    public static void main(String[] args){
        boolean fim = false;
        int opcao;
        concessionaria.adicionarVeiculo(moto);
        concessionaria.adicionarVeiculo(carro);
        concessionaria.adicionarVeiculo(caminhao);

        while (!fim) {
            do {
                System.out.println("1. Vender\n2. Gerar Extrato\n0. Sair");
                opcao = scanner.nextInt();
            } while (opcao < 0 || opcao > 2);

            switch (opcao){
                case 1: venderVeiculo();
                    break;
                case 2: concessionaria.gerarExtratoVendas();
                    break;
                case 0: fim = true;
                    break;
            }
        }

        concessionaria.gerarExtratoVendas();
        scanner.close();
    }
}
