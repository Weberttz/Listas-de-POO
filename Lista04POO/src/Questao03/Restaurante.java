package Questao03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Restaurante {
    private String nome;
    private ArrayList<Pedido> pedidos;
    private Pedido pedido;

    public Restaurante(String nome){
        this.nome = nome;
        pedidos = new ArrayList<>();
    }

    public Pedido procurarPedido(String nomeCliente){
        for(Pedido pedido : pedidos){
            if(pedido.getNomeCliente().equals(nomeCliente))
                return pedido;
        }
        return null;
    }

    public void adicionarAlimentos(String nomeCliente, String nomelAimento){
        Pedido pedido = procurarPedido(nomeCliente);

        if(pedido == null)
            return;

        pedido.registrarAlimento(nomelAimento);
    }

    public boolean registrarPedido(String nomeCliente, String endereco){
        pedido = new Pedido(nomeCliente, endereco);
        pedidos.add(pedido);
        return true;
    }

    public void organizarPedidos(){
        pedidos.sort(Comparator.comparing(Pedido::getQuantidadeAlimentos));
    }

    public void mostrarListaDePedidos(){
        for(Pedido pedido : pedidos){
            pedido.mostrarPedido();
        }
    }

    public boolean removerPedido(String nomeCliente){
        Pedido pedido = procurarPedido(nomeCliente);

        if(pedido == null)
            return false;

        pedidos.remove(pedido);
        return true;
    }

    public void gerarCupomFiscal(String nomePedido){
        pedido = procurarPedido(nomePedido);

        if(pedido == null)
            return;

        System.out.println("Nome: " + nome);
        pedido.mostrarPedido();
        pedidos.remove(pedido);
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Pedido getPedido() {return pedido;}
    public void setPedido(Pedido pedido) {this.pedido = pedido;}
}
