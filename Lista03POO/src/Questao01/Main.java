package Questao01;
import java.util.Scanner;

public class Main{

    public static Empresa empresa = new Empresa("Google");

    public static Scanner scanner = new Scanner(System.in);

    public static void listarFuncionarios(){
        System.out.println("Lista de Funcionários: ");
        empresa.listarFuncionarios();
    }

    public static void promoverFuncionario(){
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.next();
        System.out.print("Digite o novo salário: ");
        double salario = scanner.nextDouble();
        if(!empresa.promoverFuncionario(nome, cargo, salario))
            System.out.println("Funcionário não existe!");
        else
            System.out.println("Funcionário promovido com sucesso!");
    }

    public static void registrarFuncionario(){
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.next();

        empresa.registrarNovoFuncionario(nome, cargo);
        System.out.println("Funcionário registrado com sucesso|");
    }

    public static void registrarFuncionarioTransferido(){
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.next();
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        empresa.registrarFuncionarioTransferido(funcionario);
        System.out.println("Funcionário registrado com sucesso|");
    }

    public static void demitirFucionario(){
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();

        if(empresa.demitirFuncionario(nome))
            System.out.println("Funcionário demitido com sucesso!");
        else
            System.out.println("Não foi possível demitir o funcionário");
    }

    public static void darAumentoFuncionario(){
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Digite o valor de aumento: ");
        double valor = scanner.nextDouble();

        double salario = empresa.darAumento(nome, valor);
        System.out.println("O salaário após o aumento é: " + salario);
    }

    public static void mostrarMenu(){
        System.out.println("Bem vindo ao menu da empresa " + empresa.getNome());
        System.out.println("1. Registrar funcionário");
        System.out.println("2. Registrar funcionário transferido");
        System.out.println("3. Dar aumento");
        System.out.println("4. Promover funcionario");
        System.out.println("5. Demitir funcinario");
        System.out.println("6. Listar funcionários");
        System.out.println("0. Sair");
    }

    public static void main(String[] args){
        boolean fim = false;
        int opcao;

        while(!fim){
            mostrarMenu();
            do{
                System.out.print("Digite uma opcao: ");
                opcao = scanner.nextInt();
            }while(opcao < 0 || opcao > 6);

            switch (opcao){
                case 1: registrarFuncionario();
                    break;
                case 2: registrarFuncionarioTransferido();
                    break;
                case 3: darAumentoFuncionario();
                    break;
                case 4: promoverFuncionario();
                    break;
                case 5: demitirFucionario();
                    break;
                case 6: listarFuncionarios();
                    break;
                case 0:
                    fim = true;
                    break;
            }
        }

        scanner.close();
    }
}