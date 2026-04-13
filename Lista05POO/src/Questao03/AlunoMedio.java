package Questao03;

import java.util.ArrayList;

public class AlunoMedio extends Aluno{
    private ArrayList<Livro> livros;
    public AlunoMedio(String nome, int matricula) {
        super(nome, matricula);
        livros = new ArrayList<>();
    }

    public ArrayList<Livro> getLivros() {return livros;}
    public void setLivros(ArrayList<Livro> livros) {this.livros = livros;}
}
