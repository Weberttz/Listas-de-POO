package Questao03;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Aluno> alunos;
    private ArrayList<String> emprestimos;

    public Biblioteca(ArrayList<Livro> livros, ArrayList<Aluno> alunos) {
        this.livros = livros;
        this.alunos = alunos;
        emprestimos = new ArrayList<>();
    }

    public Livro procurarLivro(String titulo){
        for(Livro livro: livros){
            if(livro.getNome().equalsIgnoreCase(titulo))
                return livro;
        }
        return null;
    }

    public Aluno procurarAluno(String nome){
        for(Aluno aluno: alunos){
            if(aluno.getNome().equalsIgnoreCase(nome))
                return aluno;
        }
        return null;
    }

    public Aluno procurarAluno(int matricula){
        for(Aluno aluno: alunos){
            if(aluno.getMatricula() == matricula)
                return aluno;
        }
        return null;
    }

    public int procurarAlunos(String nome){
        int quantidade = 0;
        for(Aluno aluno: alunos){
            if(aluno.getNome().equalsIgnoreCase(nome))
                quantidade++;
        }

        return quantidade;
    }

    public boolean registrarAluno(Aluno aluno){
        for(Aluno alunoBase : alunos){
            if(Objects.equals(alunoBase.getMatricula(), aluno.getMatricula()))
                return false;
        }
        return alunos.add(aluno);
    }

    public boolean emprestarLivro(String nome, Livro livro){
        Aluno aluno = procurarAluno(nome);
        if(aluno == null) return false;

        if(aluno instanceof AlunoFundamental && ((AlunoFundamental) aluno).getLivro() != null)
            return false;

        emprestimos.add(livro.getNome() + " emprestado para " + aluno.getNome());
        return livros.remove(livro);
    }

    public boolean emprestarLivro(int matricula, Livro livro){
        Aluno aluno = procurarAluno(matricula);
        if(aluno == null) return false;

        if(aluno instanceof AlunoFundamental && ((AlunoFundamental) aluno).getLivro() != null)
            return false;

        emprestimos.add(livro.getNome() + " emprestado para " + aluno.getNome());
        return livros.remove(livro);
    }

    public boolean receberLivro(String nome){
        Aluno aluno = procurarAluno(nome);
        if(aluno == null) return false;

        if(aluno instanceof AlunoFundamental)
            livros.add(((AlunoFundamental) aluno).getLivro());
        else
            livros.add(((AlunoMedio) aluno).getLivros().getFirst());

        return true;
    }

    public boolean receberLivro(String nome, Livro livro, int matricula){
      return livros.add(livro);
    }

    public void mostrarAlunosRegistrados(){
        System.out.println("Lista de alunos registrados: ");
        for(Aluno aluno: alunos){
            System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
        }
    }

    public void mostrarLivros(){
        System.out.println("Lista de livros registrados: ");
        for(Livro livro: livros){
            System.out.println("Título: " + livro.getNome()  + " | Autor: " + livro.getAutor());
        }

        System.out.println("Lista de empréstimos: ");
        for(String str: emprestimos){
            System.out.println(emprestimos);
        }
    }
}
