package Questao03;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<String> alimentos;
    private String nomeCliente;
    private String endereco;

    public Pedido(String nomeCliente, String localDeEntrega){
        this.nomeCliente = nomeCliente;
        endereco = localDeEntrega;
        alimentos = new ArrayList<>();
    }

    public void registrarAlimento(String alimento){
        alimentos.add(alimento);
    }

    public void atualizarPedido(String alimento, String novoAlimento){
        for(String alimentoAux: alimentos){
            if(alimentoAux.equals(alimento))
                alimentoAux = novoAlimento;
        }
    }

    public void limparPedido(){
        nomeCliente = null;
        endereco = null;
        for(String alimento : alimentos){
            alimentos.remove(alimento);
        }
    }

    public void mostrarPedido(){
        System.out.println("Pedido");
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Endereço: " + endereco);
        System.out.println("Lista de alimentos: ");
        for(String alimento : alimentos)
            System.out.print(alimento + " ");

        System.out.print("\n");
    }


    public String getNomeCliente(){ return nomeCliente;}
    public String getEndereco(){ return endereco;}
    public int getQuantidadeAlimentos(){ return alimentos.size();}
    public void setNomeCliente(String nomeCliente){this.nomeCliente = nomeCliente;}
    public void setEndereco(String endereco){this.endereco = endereco;}
}
