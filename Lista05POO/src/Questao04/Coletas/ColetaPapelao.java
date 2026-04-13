package Questao04.Coletas;

import Questao04.ListaDeEstabelecimentos;

public class ColetaPapelao extends PontoDeColeta{
    public ColetaPapelao(String nome, double preco) {
        super(nome);
        definirPreco(preco);
    }

    public void definirPreco(double valor, ListaDeEstabelecimentos listaDeEstabelecimentos) {
        super.setPrecoAtual(valor * 7);

        if(listaDeEstabelecimentos.getDemandaAtual().equalsIgnoreCase("Papelão")) {
            super.setPrecoAtual(valor * 14);
        }
        else if(listaDeEstabelecimentos.getDemandaAtual().equalsIgnoreCase("Vidro"))
            super.setPrecoAtual(valor * 4);
    }

    @Override
    public String toString(){
        return "Ponto de coleta de papelão";
    }
}
