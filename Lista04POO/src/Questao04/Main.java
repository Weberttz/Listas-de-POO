package Questao04;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Semaforo semaforo = new Semaforo();
    public static Cruzamento cruzamento = new Cruzamento(semaforo);

    public static void mostrarMenu(){
        System.out.println("1. Preencher Sentidos");
        System.out.println("2. Definir preferência");
        System.out.println("3. Gerar Trânsito");
        System.out.println("0. Sair");
    }

    public static void preencherSentidos(){
        cruzamento.preencherSentidos();
        System.out.println("Transito gerado com sucesso");
    }
    public static void definirPreferencia(){ cruzamento.definirPreferencia();}
    public static void gerarTransito(){ cruzamento.gerarTransito();}

    public static void main(String[] args){
        boolean fim = false;
        int opcao;

        while (!fim){
            mostrarMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: preencherSentidos(); break;
                case 2: definirPreferencia(); break;
                case 3: gerarTransito(); break;
                case 0: fim = true; break;
                default: System.out.println("Entrada inválida");
            }
        }
    }
}
