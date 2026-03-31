package Questao01;

import java.util.ArrayList;
import java.util.Comparator;

public class Pais {
    private String nome;
    private ArrayList<Estado> estados;

    public Pais(String nome){
        this.nome = nome;
        estados = new ArrayList<>();
    }

    public boolean adicionarEstado(String nome, String sigla, double precoAlcool,double precoGasolina){
        Estado estado = new Estado(nome, sigla, precoAlcool, precoGasolina);
        estados.add(estado);
        return true;
    }

    Estado procurarEstado(String nome){
        for(Estado estado: estados){
            if(estado.getNome().equals(nome))
                return estado;
        }
        return null;
    }

    public boolean atualizarEstado(String nome,String novoNome,String novaSigla, double precoAlcool,double precoGasolina){
        Estado estado = procurarEstado(nome);

        if(estado == null)
            return false;

        estado.setNome(novoNome);
        estado.setSigla(novaSigla);
        estado.setAlcool(precoAlcool);
        estado.setGasolina(precoGasolina);
        return true;
    }

    public boolean removerEstado(String nome){
        Estado estado = procurarEstado(nome);

        if(estado == null)
            return false;

        estados.remove(estado);
        return true;
    }

    public void gerarLista(){
        estados.sort(Comparator.comparingDouble(Estado::getPrecoVantajoso).reversed());
        for(Estado estado: estados){
            System.out.println(estado.verificarVantagem() + estado.getPrecoVantajoso());
        }
    }

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
}
