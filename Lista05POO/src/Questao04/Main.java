package Questao04;

import Questao04.Coletas.ColetaMetal;
import Questao04.Coletas.ColetaPapelao;
import Questao04.Coletas.ColetaVidro;
import Questao04.Coletas.PontoDeColeta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<PontoDeColeta> estabelecimentos = new ArrayList<>(){{
        add(new ColetaVidro("Vidros e vidas", 1.5));
        add(new ColetaPapelao("Papelões e papeladadas", 1.7));
        add(new ColetaMetal("Metais e estilhaços", 2));
        add(new ColetaVidro("Vidros e vidraças", 1));
        add(new ColetaPapelao("Papelões e papéis", 1.5));
        add(new ColetaMetal("Metais e aços", 2.2));
    }};
    public static ListaDeEstabelecimentos listaDeEstabelecimentos = new ListaDeEstabelecimentos(estabelecimentos, "Vidro");

    public static void definirPrecos(){
        for(PontoDeColeta estabelecimento: listaDeEstabelecimentos.getEstabelecimentos()){
            if(estabelecimento instanceof ColetaVidro)
                ((ColetaVidro) estabelecimento).definirPreco(estabelecimento.getPreco(), listaDeEstabelecimentos);
            else if(estabelecimento instanceof ColetaPapelao)
                ((ColetaPapelao) estabelecimento).definirPreco(estabelecimento.getPreco(), listaDeEstabelecimentos);
            else
                ((ColetaMetal) estabelecimento).definirPreco(estabelecimento.getPreco(), listaDeEstabelecimentos);
        }
    }

    public static void imprimirMenu(){
        System.out.println("1 - Registrar Estabelecimento");
        System.out.println("2 - Remover Estabelecimento");
        System.out.println("3 - Definir Demanda");
        System.out.println("4 - Mostrar Lista");
        System.out.println("0 - Sair");
    }

    public static void registrarEstabelecimento(){
        boolean status = false;
        System.out.println("Mateirais: Vidro, Papelão, Metal");
        System.out.print("Digite qual o material do ponto de coleta: ");
        String material = scanner.nextLine();
        System.out.print("Digite o nome do estabelecimento: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do material: ");
        double preco = scanner.nextDouble();

        if(material.equalsIgnoreCase("Vidro")) {
            ColetaVidro coletaVidro = new ColetaVidro(nome, preco);
            status = listaDeEstabelecimentos.registrarEstabelecimento(coletaVidro);
        }
        if(material.equalsIgnoreCase("Papelão")){
            ColetaPapelao coletaPapelao = new ColetaPapelao(nome, preco);
            status = listaDeEstabelecimentos.registrarEstabelecimento(coletaPapelao);
        }
        if(material.equalsIgnoreCase("Metal")){
            ColetaMetal coletaMetal = new ColetaMetal(nome, preco);
            status = listaDeEstabelecimentos.registrarEstabelecimento(coletaMetal);
        }

        if(status) System.out.println("Estabelecimento registrado com sucesso!");
        else System.out.println("Não foi possível registrar o estabelecimento!");
    }

    public static void removerEstabelecimento(){
        boolean status = false;
        System.out.print("Digite o nome do estabelecimento: ");
        String nome = scanner.nextLine();

        status = listaDeEstabelecimentos.removerEstabelecimento(nome);

        if(status) System.out.println("Estabelecimento removido com sucesso!");
        else System.out.println("Não foi possível remover o estabelecimento!");
    }

    public static void definirDemanda(){
        System.out.println("Mateirais: Vidro, Papelão, Metal");
        System.out.print("Digite qual o material quer definir como demanda: ");
        String material = scanner.next();
        if(listaDeEstabelecimentos.definirDemanda(material))
            System.out.println("Demanda definida com sucesso!");
        else
            System.out.println("Não foi possível definir a demanda");
    }

    public static void mostrarLista(){
        listaDeEstabelecimentos.mostrarLista();
    }

    public static void main(String[] args){
        boolean fim = false;
        int opcao;

        while(!fim){
            definirPrecos();
            imprimirMenu();
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1: registrarEstabelecimento(); break;
                case 2: removerEstabelecimento(); break;
                case 3: definirDemanda();break;
                case 4: mostrarLista(); break;
                case 0: fim = true; break;
                default: System.out.println("Entrada inválida!");
            }
        }
    }
}
