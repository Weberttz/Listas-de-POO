package Questao03;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Livro> livros = new ArrayList<>(){{
        add(new Livro("As vantagens de ser invisível", "Stephen Chbosky"));
        add(new Livro("A culpa é das estrelas", "John Green"));
        add(new Livro("Introduction to Java programming", "Liang, Y. Daniel"));
        add(new Livro("Java", "Deitel, H."));
    }};
    public static ArrayList<Aluno> alunos = new ArrayList<>(){{
        add(new AlunoMedio("Jonh", 1234) );
        add(new AlunoFundamental("Maicon", 1334));
        add(new AlunoMedio("Mirela", 4657));
        add(new AlunoMedio("Maicon", 1222));
        add(new AlunoFundamental("Ana", 1224));
    }};
    public static Biblioteca biblioteca = new Biblioteca(livros, alunos);

    public static void Menu(){
        System.out.println("1 - Registrar Aluno");
        System.out.println("2 - Emprestar Livro");
        System.out.println("3 - Receber Livro");
        System.out.println("4 - Mostrar Alunos Registrados");
        System.out.println("5 - Mostrar Livros");
        System.out.println("0 - Sair");
        System.out.print("Digite uma opção: ");
    }

    public static void registrarAluno() {
        System.out.println("Digite o escolaridade do aluno (Fundamental ou Medio): ");
        String tipo = scanner.next();
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();

        if(tipo.equalsIgnoreCase("Fundamental")) {
            AlunoFundamental aluno = new AlunoFundamental(nome, matricula);
            biblioteca.registrarAluno(aluno);
        }
        else {
            AlunoMedio aluno = new AlunoMedio(nome, matricula);
            biblioteca.registrarAluno(aluno);
        }
    }

    public static void emprestrarLivro(){
        String nome = "";
        int matricula = 0;
        boolean status = false;
        biblioteca.mostrarLivros();
        System.out.println("Escolha uma maneira de emprestar livro: ");
        System.out.println("1 - Com base no nome do aluno\n2 - Com base na matrícula do aluno");
        System.out.print("Digite a opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do aluno: ");
                nome = scanner.next();
                break;
            case 2:
                System.out.print("Digite a matrícula do aluno: ");
                matricula = scanner.nextInt();
                break;
            default:
                System.out.println("Entrada inválida");
        }

        System.out.print("Digite o título do livro: ");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        Livro livro = biblioteca.procurarLivro(titulo);
        if(livro == null) {
            System.out.println("Livro não encontrado");
            return;
        }

        if(opcao == 1) status = biblioteca.emprestarLivro(nome, livro);
        else status = biblioteca.emprestarLivro(matricula, livro);

        if(status)
            System.out.println("Livro emprestado com sucesso!");
        else
            System.out.println("Não foi possível emprestar o livro!");
    }

    public static void receberLivro(){
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();

        if(biblioteca.receberLivro(nome)) {
            System.out.println("Livro recebido com sucesso!");
            return;
        }

        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.next();
        Livro livro = biblioteca.procurarLivro(titulo);

        if(biblioteca.receberLivro(nome, livro, matricula))
            System.out.println("Livro recebido com sucesso!");
        else
            System.out.println("não foi possível receber o livro");
    }

    public static void mostrarAlunosRegistrados(){
        biblioteca.mostrarAlunosRegistrados();
    }
    public static void mostrarLivros(){
        biblioteca.mostrarLivros();
    }


    public static void main(String[] args){
        boolean fim = false;
        int opcao;

        while (!fim){
            Menu();
            opcao = scanner.nextInt();
            switch (opcao){
                case 1: registrarAluno(); break;
                case 2: emprestrarLivro(); break;
                case 3: receberLivro(); break;
                case 4: mostrarAlunosRegistrados(); break;
                case 5: mostrarLivros();break;
                case 0: fim = true;
                default: System.out.println("entrada inválida!");
            }
        }
    }
}
