package Questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Animal> animais = new ArrayList<>();

    public static void registrarAnimal(){
        Animal animal = null;
        String nome;
        double peso;
        boolean registrado;
        
        do {
            registrado = true;
            System.out.println("Digite o nome do animal: ");
            nome = scanner.next();

            switch (nome) {
                case "Galinha":
                    animal = new Animal();
                    break;
                case "Pato", "Ganso":
                    animal = new Animal(nome);
                    break;
                case "Vaca", "Porco":
                    System.out.print("Digite o peso em Kg: ");
                    peso = scanner.nextDouble();
                    animal = new Animal(nome, peso);
                    break;
                default:
                    System.out.println("Nome inválido");
                    registrado = false;
            }
        }while (!registrado);
        
        animais.add(animal);
    }

    public static void listarAnimais() {
        if(animais.isEmpty())
            System.out.println("Nenhum animal registrado!");
        for(Animal animal: animais) {
            System.out.println(animal.gerarRelatorio());
        }
    }

    public static void main(String[] args) {

        boolean fim = false;
        int opcao;


        while(!fim){
            System.out.println("1. Registrar Lote\n2. Gerar Relatório\n0. Sair\nOpção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1: registrarAnimal();
                    break;
                case 2: listarAnimais();
                    break;
                case 0: fim = true;
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }
        scanner.close();
    }
}
