package Questao01;

import java.util.Scanner;

public class Main{

    public static Scanner scanner = new Scanner(System.in);
    public static Pais pais = new Pais("Brasil");

    public static void mostrarMenu(){
        System.out.println("1. Adicionar estado");
        System.out.println("2. Atualizar estado");
        System.out.println("3. Remover Estado");
        System.out.println("4. Gerar lista");
        System.out.println("0. Sair");
    }

    public static void adicionarEstado(){
        String nome, sigla;
        double precoAlcool, precoGasolina;

        System.out.print("Digite o nome do estado: ");
        nome = scanner.nextLine();
        System.out.print("Digite a sigla do estado: ");
        sigla = scanner.nextLine();
        System.out.print("Digite o preço do álcool nesse estado: ");
        precoAlcool = scanner.nextDouble();
        System.out.print("Digite o preço da gasolina nesse estado: ");
        precoGasolina = scanner.nextDouble();

        if(pais.adicionarEstado(nome, sigla, precoAlcool, precoGasolina))
            System.out.println("Estado adicionado com sucesso");
        else
            System.out.println("Não foi possível adicionar o estado");
    }

    public static void atualizarEstado(){
        String nome, novoNome, sigla;
        double precoAlcool, precoGasolina;

        System.out.print("Digite o nome do estado: ");
        nome = scanner.nextLine();
        System.out.print("Digite o novo nome para o qual deseja atualizar: ");
        novoNome = scanner.nextLine();
        System.out.print("Digite a sigla do estado: ");
        sigla = scanner.nextLine();
        System.out.print("Digite o preço do álcool nesse estado: ");
        precoAlcool = scanner.nextDouble();
        System.out.print("Digite o preço da gasolina nesse estado: ");
        precoGasolina = scanner.nextDouble();

        if(pais.atualizarEstado(nome, novoNome, sigla, precoAlcool, precoGasolina))
            System.out.println("Estado atuzalizado com sucesso");
        else
            System.out.println("Não foi possível atualizar o estado");
    }

    public static void removerEstado(){
        String nome;

        System.out.print("Digite o nome do estado: ");
        nome = scanner.nextLine();
        if(pais.removerEstado(nome))
            System.out.println("Estado removido com sucesso");
        else
            System.out.println("Não foi possível remover o estado");
    }

    public static void gerarLista(){pais.gerarLista();}

    public static void main(String[] args){
        boolean fim = false;
        int opcao;
        while (!fim)
        {
            mostrarMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1: adicionarEstado(); break;
                case 2: atualizarEstado(); break;
                case 3: removerEstado(); break;
                case 4: gerarLista(); break;
                case 0: fim = true; break;
                default: System.out.println("Entrada inválida");
            }
        }
    }
}