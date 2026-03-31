package Questao05;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static CalendarioDeAniversario agenda = new CalendarioDeAniversario();

    public static void mostrarMenu(){
        System.out.println("1. Registrar amigo");
        System.out.println("2. Remover amigo");
        System.out.println("3. Atualizar amigo");
        System.out.println("4. Registrar presentes dados");
        System.out.println("5. Organizar por idade");
        System.out.println("6. Organizar por ordem alfabética");
        System.out.println("7. Verificar Aniversário");
        System.out.println("8. Mostrar amigos");
    }

    public static void registrarAmigo(){
        String nome, data;
        System.out.print("Digite o nome do amigo: ");
        nome = scanner.nextLine();
        do {
            System.out.print("Digite a data de nascimento do amigo: ");
            data = scanner.nextLine();
        }while (data.length() != 10);

        if(agenda.registrarAmigo(nome, data))
            System.out.println("Amigo registrado com sucesso.");
        else
            System.out.println("Não foi possível registrar o amigo.");
    }

    public static void removerAmigo(){
        String nome;
        System.out.print("Digite o nome do amigo: ");
        nome = scanner.nextLine();

        if(agenda.removerAmigo(nome))
            System.out.println("Amigo removido com sucesso.");
        else
            System.out.println("Não foi possivel remover o amigo.");
    }

    public static void atualizarAmigo(){
        String nome, novoNome, data;
        System.out.print("Digite o nome do amigo: ");
        nome = scanner.nextLine();
        System.out.print("Digite o nome para o qual deseja atualizar: ");
        novoNome = scanner.nextLine();
        System.out.print("Digite a data de nascimento do amigo: ");
        data = scanner.nextLine();

        if(agenda.atualizarAmigo(nome, novoNome, data))
            System.out.println("Registro atualizado com sucesso.");
        else
            System.out.println("Não foi possivel atuzalizar o registro.");
    }

    public static void registrarPresentesDados() {
        String nome, presente;
        System.out.print("Digite o nome do amigo: ");
        nome = scanner.nextLine();
        System.out.print("Digite o presente que ele deu: ");
        presente = scanner.nextLine();

        if(agenda.registrarPresentesDados(nome, presente))
            System.out.println("Presente registrado com sucesso.");
        else
            System.out.println("Não foi possivel registrar o presente.");
    }

    public static void organizarPorIdade(){agenda.organizarPorIdade();}
    public static void organizarPorOrdemAlfabetica(){agenda.organizarAlfabeticamente();}
    public static void verificarAniversario(){
        int dia;
        System.out.print("Digite o dia que deseja verificar: ");
        dia = scanner.nextInt();

        if(agenda.verificarAniversario(dia))
            System.out.println("Existe um amigo que faz aniversário nesse dia");
        else
            System.out.println("Não existe amigo que faz aniversário nesse dia");
    }
    public static void mostrarAmigos(){
        int dia;
        System.out.print("Digite o dia que deseja verificar: ");
        dia = scanner.nextInt();
        agenda.mostrarAmigos(dia);
    }
    public static void main(String[] args) {
        boolean fim = false;
        int opcao;

        while(!fim){
            mostrarMenu();
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1: registrarAmigo(); break;
                case 2: removerAmigo(); break;
                case 3: atualizarAmigo(); break;
                case 4: registrarPresentesDados(); break;
                case 5: organizarPorIdade(); break;
                case 6: organizarPorOrdemAlfabetica(); break;
                case 7: verificarAniversario(); break;
                case 8: mostrarAmigos(); break;
                case 0: fim = true;  break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
