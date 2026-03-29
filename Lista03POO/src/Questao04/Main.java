package Questao04;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Disciplina disciplina = new Disciplina("POO", 1801, 50);

    public static void Menu(){
        System.out.println("Bem vindo à disciplina: " + disciplina.getNome() + " código: " + disciplina.getCodigo());
        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Mudar nota de aluno");
        System.out.println("3. Listar alunos em ordem alfabética");
        System.out.println("4. Listar alunos em ordem de média");
        System.out.println("5. Gerar Estatísticas");
        System.out.println("0. Sair");
    }

    public static void AdicionarAluno(){
        String nome;
        int matricula;
        System.out.print("Digite o nome do aluno: ");
        nome = scanner.next();
        System.out.print("Digite a matrícula do aluno: ");
        matricula = scanner.nextInt();

        if(disciplina.matricularAluno(nome, matricula))
            System.out.println("Aluno matriculado com sucesso");
        else
            System.out.println("Não foi possível matricular o aluno");
    }

    public static void MudarNotaAluno(){
        int matricula;
        double nota1, nota2;

        System.out.print("Digite a matrícula do aluno: ");
        matricula = scanner.nextInt();
        System.out.print("Digite a primeira nota que dejesa alterar: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota que dejesa alterar: ");
        nota2 = scanner.nextDouble();

        if(disciplina.alterarNotas(matricula, nota1, nota2))
            System.out.println("Notas alteradas com sucesso!");
        else
            System.out.println("Não possível alterar as notas, aluno não matriculado");
    }

    public static void gerarRelatorio(){
        disciplina.gerarEstatisitcas();
    }

    public static void listarNomesEmOrdemAlfabtetica(){
        disciplina.listarEmOrdemAlfabetica();
    }

    public static void listarEMOrdemDeMedia(){ disciplina.listarEmOrdemMedias();}

    public static void main(String[] args){

        boolean fim = false;
        int opcao;

        while(!fim){
            Menu();
            System.out.println("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1: AdicionarAluno();
                    break;
                case 2: MudarNotaAluno();
                    break;
                case 3: listarNomesEmOrdemAlfabtetica();
                    break;
                case 4: listarEMOrdemDeMedia();
                    break;
                case 5: gerarRelatorio();
                    break;
                case 0: fim = true;
                    break;
            }
        }
        scanner.close();
    }
}
