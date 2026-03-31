package Questao03;

import java.util.Scanner;

public class Main {

    public static Restaurante restaurante = new Restaurante("Ueceana");
    public static Scanner scanner = new Scanner(System.in);

    public static void adicionarAlimento(){
        String nomeCliente, nomeAlimento;
        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Digite o nome do alimento: ");
        nomeAlimento = scanner.nextLine();
        restaurante.adicionarAlimentos(nomeCliente, nomeAlimento);
    }

    public static void registrarPedido(){
        String nome, endereco;
        System.out.print("Digite o nome do cliente: ");
        nome = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        endereco = scanner.nextLine();

        if(restaurante.registrarPedido(nome, endereco))
            System.out.println("Pedido registrado com sucesso.");
        else
            System.out.println("Não foi possível registrar o pedido.");
    }

    public static void mostrarMenu(){
        System.out.println("1. Registrar pedido");
        System.out.println("2. Registrar alimento para um pedido");
        System.out.println("3. Organizar pedidos");
        System.out.println("4. Remover pedido");
        System.out.println("5. Mostrar lista de pedidos");
        System.out.println("6. Gerar cupom fiscal");
        System.out.println("0. Sair do sistema");
    }

    public static void organizarPedidos(){restaurante.organizarPedidos();}

    public static void removerPedido(){
        String nome;
        System.out.print("Digite o nome do cliente: ");
        nome = scanner.nextLine();

        if(restaurante.removerPedido(nome))
            System.out.println("Pedido removido com sucesso");
        else
            System.out.println("Não foi possível remover o pedido.");
    }

    public static void mostrarListaDePedidos(){restaurante.mostrarListaDePedidos();}

    public static void  GerarCumpomFiscal(){
        String nome;
        System.out.print("Digite o nome do cliente: ");
        nome = scanner.nextLine();
        restaurante.gerarCupomFiscal(nome);
    }

    public static void main(String[] args){
        int opcao;
        boolean fim = false;

        while (!fim){
            mostrarMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao){
                case 1: registrarPedido(); break;
                case 2: adicionarAlimento(); break;
                case 3: organizarPedidos(); break;
                case 4: removerPedido(); break;
                case 5: mostrarListaDePedidos(); break;
                case 6: GerarCumpomFiscal(); break;
                case 0: fim = true; break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
