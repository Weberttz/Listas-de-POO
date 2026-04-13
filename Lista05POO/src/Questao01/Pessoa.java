package Questao01;

import java.util.ArrayList;
public abstract class Pessoa {
    private String nome;
    private String matricula;
    private ArrayList<Livro> livrosEmprestados;

    public Pessoa(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        livrosEmprestados = new ArrayList<>();
    }

    public abstract boolean pedirEmprestado(Livro livro);
    public abstract double devolverLivro(String titulo, int quantidadeDias);
    public abstract double devolverLivro(int quantidade);
    public abstract double calcularMulta(String titulo, int quantidadeDias);

    public Livro procurarLivro(String titulo){
        for(Livro livro: livrosEmprestados){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public ArrayList<Livro> getLivrosEmprestados() {return livrosEmprestados;}
    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {this.livrosEmprestados = livrosEmprestados;}
}
