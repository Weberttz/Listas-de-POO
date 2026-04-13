package Questao04.Coletas;

import Questao04.ListaDeEstabelecimentos;

public class ColetaMetal extends PontoDeColeta{
    public ColetaMetal(String nome, double preco) {
        super(nome);
        definirPreco(preco);
    }

    public void definirPreco(double valor, ListaDeEstabelecimentos listaDeEstabelecimentos) {
        super.setPrecoAtual(valor * 10);

        if(listaDeEstabelecimentos.getDemandaAtual().equalsIgnoreCase("Metal")) {
            super.setPrecoAtual(valor * 20);
        }
        else if(listaDeEstabelecimentos.getDemandaAtual().equalsIgnoreCase("Papelão"))
            super.setPrecoAtual(valor * 6);
    }

    @Override
    public String toString(){
        return "Ponto de coleta de metal";
    }
}
