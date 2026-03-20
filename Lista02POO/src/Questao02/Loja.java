package Questao02;
import javax.swing.*;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> itensDeVenda = new ArrayList<>();
    private ArrayList<Produto> carrinhoDeCompras = new ArrayList<>();

    public Loja(String nome){
        this.nome = nome;
    }

    public void adicionarItemDeVenda(Produto produto){
        itensDeVenda.add(produto);
    }

    public double vender(Produto produto){
        carrinhoDeCompras.add(produto);
        return produto.getPreco();
    }

    public Produto procurarProduto(String nome){
        for(Produto produto: itensDeVenda){
            if(produto.getNome().equals(nome))
                return produto;
        }
        return null;
    }

   public  void gerarNotaFiscal() {
        double total = 0;
        System.out.println("Loja: " + nome);
        System.out.println("Lista de Compras");
        for(Produto produto: carrinhoDeCompras) {
            System.out.println("Nome: " + produto.getNome() + " | Descrição: " + produto.getDescricao());
            total+= produto.getPreco();
        }
        System.out.println("Valor total da compra " + total);
    }

    public void mostrarItensDeVenda(){
        System.out.println("Loja: " + nome);
        System.out.println("Lista de Produtos à Venda");
        for(Produto item: itensDeVenda) {
            System.out.println(item.mostrarProduto());
        }
    }

    public int getTamanhoCarrinho(){
        return carrinhoDeCompras.size();
    }

}
