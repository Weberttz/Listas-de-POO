package Questao04;

import Questao04.Coletas.ColetaMetal;
import Questao04.Coletas.ColetaPapelao;
import Questao04.Coletas.ColetaVidro;
import Questao04.Coletas.PontoDeColeta;

import java.util.ArrayList;

public class ListaDeEstabelecimentos {
    private ArrayList<PontoDeColeta> estabelecimentos;
    private String demandaAtual;

    public ListaDeEstabelecimentos(ArrayList<PontoDeColeta> estabelecimentos, String demandaAtual){
        this.estabelecimentos = estabelecimentos;
        this.demandaAtual = demandaAtual;
    }

    public boolean registrarEstabelecimento(PontoDeColeta estabelecimento){
        boolean verificacao = verificarEstabelecimento(estabelecimento);
        if(!verificacao) return false;

        return estabelecimentos.add(estabelecimento);
    }

    public boolean removerEstabelecimento(String nome){
        PontoDeColeta estabelecimento = procurarEstabelecimento(nome);
        return estabelecimentos.remove(estabelecimento);
    }

    public PontoDeColeta procurarEstabelecimento(String nome){
        for(PontoDeColeta estabelecimento: estabelecimentos){
            if(estabelecimento.getNome().equalsIgnoreCase(nome))
                return estabelecimento;
        }
        return null;
    }

    public boolean verificarEstabelecimento(PontoDeColeta estabelecimento){
        String nome = estabelecimento.getNome();
        for(PontoDeColeta ponto: estabelecimentos){
            if(ponto instanceof ColetaVidro && ponto.getNome().equalsIgnoreCase(nome))
                return false;
            if(ponto instanceof ColetaPapelao && ponto.getNome().equalsIgnoreCase(nome))
                return false;
            if(ponto instanceof ColetaMetal && ponto.getNome().equalsIgnoreCase(nome))
                return false;
        }
        return true;
    }

    public boolean definirDemanda(String produto){
        if(produto.equalsIgnoreCase("Vidro")
        || produto.equalsIgnoreCase("Papelão")
        || produto.equalsIgnoreCase("Metal")) {
            demandaAtual = produto;
            return  true;
        }
        return false;
    }

    public double calcularMelhorEstabelecimento(PontoDeColeta estabelecimento, double menorPreco){
        return switch (estabelecimento) {
            case ColetaVidro coletaVidro when demandaAtual.equalsIgnoreCase("Vidro") && estabelecimento.getPrecoAtual() < menorPreco ->
                    estabelecimento.getPrecoAtual();
            case ColetaPapelao coletaPapelao when demandaAtual.equalsIgnoreCase("Papelão") && estabelecimento.getPrecoAtual() < menorPreco ->
                    estabelecimento.getPrecoAtual();
            case ColetaMetal coletaMetal when demandaAtual.equalsIgnoreCase("Metal") && estabelecimento.getPrecoAtual() < menorPreco ->
                    estabelecimento.getPrecoAtual();
            default -> menorPreco;
        };
    }

    public double calcularPiorEstabelecimento(PontoDeColeta estabelecimento, double maiorPreco){
        return switch (estabelecimento) {
            case ColetaVidro coletaVidro when demandaAtual.equalsIgnoreCase("Vidro") && estabelecimento.getPrecoAtual() > maiorPreco ->
                    estabelecimento.getPrecoAtual();
            case ColetaPapelao coletaPapelao when demandaAtual.equalsIgnoreCase("Papelão") && estabelecimento.getPrecoAtual() > maiorPreco ->
                    estabelecimento.getPrecoAtual();
            case ColetaMetal coletaMetal when demandaAtual.equalsIgnoreCase("Metal") && estabelecimento.getPrecoAtual() > maiorPreco ->
                    estabelecimento.getPrecoAtual();
            default -> maiorPreco;
        };
    }

    public void mostrarLista(){
        PontoDeColeta piorEstabelecimento = null;
        PontoDeColeta melhorEstabelecimento = null;
        double menorPreco = 1000;
        double maiorPreco = 0;
        System.out.println("Lista de estabelecimentos: ");
        for(PontoDeColeta estabelecimento: estabelecimentos){
            System.out.println(estabelecimento + " | Nome: " + estabelecimento.getNome() + " | Preço: " + estabelecimento.getPrecoAtual());
            if(calcularMelhorEstabelecimento(estabelecimento, menorPreco) < menorPreco) {
                menorPreco = calcularMelhorEstabelecimento(estabelecimento, menorPreco);
                melhorEstabelecimento = estabelecimento;
            }
            if(calcularPiorEstabelecimento(estabelecimento, maiorPreco) > maiorPreco) {
                maiorPreco = calcularPiorEstabelecimento(estabelecimento, maiorPreco);
                piorEstabelecimento = estabelecimento;
            }
        }
        System.out.println("Material em demanda: " + demandaAtual);

        if(melhorEstabelecimento != null) {
            System.out.println("Melhor estabelecimento: " + melhorEstabelecimento.getNome() + " | Preco do " + demandaAtual
                    + ": " + melhorEstabelecimento.getPrecoAtual());
        }
        if (piorEstabelecimento != null) {
            System.out.println("Pior estabelecimento: " + piorEstabelecimento.getNome() + " | Preço do " + demandaAtual +
                    ": " + piorEstabelecimento.getPrecoAtual());
        }
    }

    public ArrayList<PontoDeColeta> getEstabelecimentos() {return estabelecimentos;}
    public void setEstabelecimentos(ArrayList<PontoDeColeta> estabelecimentos) {this.estabelecimentos = estabelecimentos;}
    public String getDemandaAtual() {return demandaAtual;}
    public void setDemandaAtual(String demandaAtual) {this.demandaAtual = demandaAtual;}
}
