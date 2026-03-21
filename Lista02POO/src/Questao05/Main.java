package Questao05;

import java.util.Scanner;

public class Main {

    static Elevador elevador = new Elevador(10);

    public static void Menu(){
        System.out.println("Menu:");
        if(elevador.getAndarAtual() == 0)
            System.out.println("Andar Atual: Térreo");
        else
            System.out.println("Andar Atual: " + elevador.getAndarAtual());
        System.out.println("Quantidade de pessoas no elevador: " + elevador.getPessoasPresentes());
        System.out.println("1. Adicionar pessoa ao elevador");
        System.out.println("2. Retirar pessoa do elevador");
        System.out.println("3. Subir um andar do elevador");
        System.out.println("4. Subir elevador para o andar escolhido");
        System.out.println("5. Descer um andar do elevador");
        System.out.println("6. Descer elevador para o andar escolhido");
        System.out.println("0. Sair");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean fim = false;
        int opcao;

        while (!fim) {
            Menu();
            System.out.print("Digite a opção que deseja: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if(!elevador.entra())
                        System.out.println("A pessoa não entrou, pois elevador esta lotado.");
                    break;
                case 2:
                    if(!elevador.sai())
                        System.out.println("Não é possível tirar pessoa, pois o elevador está vazio");
                    break;
                case 3:
                    if(!elevador.sobe())
                        System.out.println("Não é possível subir mais andares");
                    break;
                case 4:
                    System.out.print("Digite qual andar deseja subir: ");
                    opcao = scanner.nextInt();
                    if(!elevador.sobe(opcao))
                        System.out.println("Não é possível subir para esse andar");
                    break;
                case 5:
                    if(!elevador.desce())
                        System.out.println("Não é possível descer, pois já está no térreo");
                    break;
                case 6:
                    System.out.print("Digite para qual andar deseja descer: ");
                    opcao = scanner.nextInt();
                    if(!elevador.desce(opcao))
                        System.out.println("Não pode descer para esse andar");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    fim = true;
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }
        scanner.close();
    }
}
