package Questao01;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        ArrayList<Livro> livros = new ArrayList<>(){{
                add(new Livro("As vantagens de ser invisível", "Stephen Chbosky"));
                add(new Livro("A culpa é das estrelas", "John Green"));
                add(new Livro("Introduction to Java programming", "Liang, Y. Daniel"));
                add(new Livro("Java - Como Programar", "Deitel, H."));
        }};

        Aluno aluno = new Aluno("Jonh", "Ciência da Computação", "1234");
        Professor professor = new Professor("Paulo Henrique", "Doutor", "5678");


        System.out.println("Aluno pediu o primeiro livro emprestado: " + aluno.pedirEmprestado(livros.get(0)));
        System.out.println("Aluno pediu o segundo livro emprestado: " + aluno.pedirEmprestado(livros.get(1)));
        System.out.println("Aluno pediu o terceiro livro emprestado: " + aluno.pedirEmprestado(livros.get(2)));
        System.out.println("Aluno pediu o quarto livro emprestado: " + aluno.pedirEmprestado(livros.get(3)));

        System.out.println("Professor pediu emprestado o primeiro livro: " + professor.pedirEmprestado(livros.get(0)));
        System.out.println("Professor pediu segundo o primeiro livro: " + professor.pedirEmprestado(livros.get(1)));
        System.out.println("Professor pediu terceiro o primeiro livro: " + professor.pedirEmprestado(livros.get(2)));
        System.out.println("Professor pediu quarto o primeiro livro: " + professor.pedirEmprestado(livros.get(3)));

        System.out.println("Aluno devolveu o primeiro livro após 10 dias: " + aluno.devolverLivro(livros.getFirst().getTitulo(), 10));
        System.out.println("Aluno devolveu o restante dos livros com 8 dias: " + aluno.devolverLivro(8));

        System.out.println("Professor devolveu o primeiro livro após 10 dias: " + professor.devolverLivro(livros.getFirst().getTitulo(), 10));
        System.out.println("Professor devolveu o restante dos livros com 8 dias: " + professor.devolverLivro(8));
    }
}