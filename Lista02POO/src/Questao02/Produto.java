package Questao02;

public class Produto {
    private String nome, descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String mostrarProduto(){
        return nome + " | " + descricao + " | " + preco;
    }
    public String getNome(){ return nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getDescricao(){ return descricao;}
    public void setDescricao(String descricao){ this.descricao = descricao;}
    public double getPreco(){return preco;}
    public void setPreco(double preco){ this.preco = preco;}
}
