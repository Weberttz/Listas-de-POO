package Questao01;

public class Professor extends Pessoa{
    private String titulacao;

    public Professor(String nome, String titulacao, String matricula){
        this.titulacao = titulacao;
        super(nome, matricula);
    }
    @Override
    public boolean pedirEmprestado(Livro livro) {
        int quantidadeMaxima = 4;
        if(getLivrosEmprestados().size() < quantidadeMaxima){
            super.getLivrosEmprestados().add(livro);
            return true;
        }
        return false;
    }
    @Override
    public double calcularMulta(String titulo, int quantidadeDias) {
        int atrasoMax = 7;
        double multa = 1;

        if(titulo.equalsIgnoreCase("Mestre"))
            multa  = 0.8;

        if(quantidadeDias > atrasoMax)
            return (quantidadeDias - atrasoMax) * multa;

        return 0;
    }
    @Override
    public double devolverLivro(String titulo, int quantidadeDias) {
        Livro livro = procurarLivro(titulo);
        super.getLivrosEmprestados().remove(livro);
        return calcularMulta(titulo, quantidadeDias);
    }
    @Override
    public double devolverLivro(int quantidadeDias) {
        double totalMulta = 0;
        for(Livro livro: super.getLivrosEmprestados()){
            totalMulta += calcularMulta(livro.getTitulo(), quantidadeDias);
        }
        super.getLivrosEmprestados().clear();

        return totalMulta;
    }
}
