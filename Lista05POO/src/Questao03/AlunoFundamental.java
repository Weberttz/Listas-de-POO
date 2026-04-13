package Questao03;

public class AlunoFundamental extends Aluno{
    private Livro livro;

    public AlunoFundamental(String nome, int matricula) {
        super(nome, matricula);
    }

    public Livro getLivro() {return livro;}
    public void setLivro(Livro livro) {this.livro = livro;}
}
