package Questao04.Coletas;

import Questao04.ListaDeEstabelecimentos;

public class ColetaVidro extends PontoDeColeta  {

    public ColetaVidro(String nome, double preco) {
        super(nome);
        definirPreco(preco);
    }

    public void definirPreco(double valor, ListaDeEstabelecimentos listaDeEstabelecimentos) {
        super.setPrecoAtual(valor * 5);

        if(listaDeEstabelecimentos.getDemandaAtual().equalsIgnoreCase("Vidro")) {
            super.setPrecoAtual(valor * 10);
        }
        else if(listaDeEstabelecimentos.getDemandaAtual().equalsIgnoreCase("Metal"))
            super.setPrecoAtual(valor * 3);
    }

    @Override
    public String toString(){
        return "Ponto de coleta de vidro";
    }
}
