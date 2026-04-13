package Questao04.Coletas;

import Questao04.ListaDeEstabelecimentos;

public abstract class PontoDeColeta {
    private String nome;
    private double preco;
    private double precoAtual;

    public PontoDeColeta(String nome){
        this.nome = nome;
    }

    public void definirPreco(double valor){
        this.preco = valor;
        this.precoAtual = valor * 5;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}
    public double getPrecoAtual() {return precoAtual;}
    public void setPrecoAtual(double precoAtual) {this.precoAtual = precoAtual;}
}
