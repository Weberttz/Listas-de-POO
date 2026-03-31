package Questao05;

import java.util.ArrayList;
import java.util.Comparator;

public class CalendarioDeAniversario {
    private ArrayList<Amigo> amigos;

    public CalendarioDeAniversario(){
        amigos = new ArrayList<>();
    }

    public Amigo procurarAmigo(String nome){
        for(Amigo amigo: amigos){
            if(amigo.getNome().equals(nome))
                return amigo;
        }
        return null;
    }

    public boolean registrarAmigo(String nome, String dataDeAniversario){
        Amigo amigo = new Amigo(nome, dataDeAniversario);
        amigos.add(amigo);
        return true;
    }

    public boolean removerAmigo(String nome){
        Amigo amigo = procurarAmigo(nome);

        if(amigo == null)
            return false;

        amigos.remove(amigo);
        return true;
    }

    public boolean atualizarAmigo(String nome, String novoNome, String novaData){
        Amigo amigo = procurarAmigo(nome);

        if(amigo == null)
            return false;

        amigo.setNome(novoNome);
        amigo.setDataDeNascimento(novaData);
        return true;
    }

    public boolean registrarPresentesDados(String nome, String presente){
        Amigo amigo = procurarAmigo(nome);

        if(amigo == null)
            return false;

        amigo.acionarPresente(presente);
        return true;
    }

    public void organizarPorIdade(){
        amigos.sort(Comparator.comparing(Amigo::getIdade));
    }

    public void organizarAlfabeticamente(){
        amigos.sort(Comparator.comparing(Amigo::getNome));
    }

    public boolean verificarAniversario(int dia){
        for(Amigo amigo: amigos){
            if(amigo.getDiaNascimento() == dia)
                return true;
        }
        return false;
    }

    public void mostrarAmigos(int dia){
        for(Amigo amigo: amigos){
            amigo.mostrarDados();
        }
        if(verificarAniversario(dia))
            System.out.println("Algum amigo faz aniversário nesse dia");
    }

    public ArrayList<Amigo> getAmigos() { return amigos;}
}
