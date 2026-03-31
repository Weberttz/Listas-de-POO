package Questao04;
import Questao04.enums.Veiculos;

import java.util.ArrayList;
import java.util.Random;

public class Cruzamento {
    private ArrayList<String> sentidoHorizontal;
    private ArrayList<String> sentidoVertical;
    private Semaforo semaforo;

    public Cruzamento(Semaforo semaforo){
        this.semaforo = semaforo;
        sentidoVertical = new ArrayList<>();
        sentidoHorizontal = new ArrayList<>();
    }

    public void preencherSentidos(){
        Random gerador = new Random();
        int numeroSorteado;
        Veiculos[] classes = Veiculos.values();
        Veiculos veiculoHorizontal, veiculoVertical;

        if(!sentidoHorizontal.isEmpty())
            sentidoHorizontal.clear();

        if(!sentidoVertical.isEmpty())
            sentidoVertical.clear();

        for(int i=0; i<10; i++) {
            numeroSorteado = gerador.nextInt(8);
            veiculoVertical = classes[numeroSorteado];
            numeroSorteado = gerador.nextInt(8);
            veiculoHorizontal = classes[numeroSorteado];

            sentidoHorizontal.add(veiculoHorizontal.getNome());
            sentidoVertical.add(veiculoVertical.getNome());
        }
    }

    public void definirPreferencia(){
        int quantidadeHorizontal = 0;
        int quantidadeVertical = 0;

        for(String string: sentidoVertical){
            switch (string){
                case "Ambulância", "Bombeiro", "Polícia":
                    quantidadeVertical++;
                    break;
            }
        }
        for(String string: sentidoHorizontal){
            switch (string){
                case "Ambulância", "Bombeiro", "Polícia":
                    quantidadeHorizontal++;
                    break;
            }
        }

        if(quantidadeHorizontal == quantidadeVertical) {
            semaforo.setValorVertical(false);
            semaforo.setValorVertical(false);
            System.out.println("Semáforo funcionando normalmente.");
        }

        if(quantidadeHorizontal > quantidadeVertical) {
            semaforo.setValorHorizontal(true);
            semaforo.setValorVertical(false);
            System.out.println("Dando preferência ao sentido horizontal");
        }

        if(quantidadeHorizontal < quantidadeVertical){
            semaforo.setValorVertical(true);
            semaforo.setValorHorizontal(false);
            System.out.println("Dando preferência ao sentido vertical");
        }
    }
    public void preferenciaPadrao(){
        semaforo.setValorHorizontal(true);
        semaforo.setValorVertical(false);
    }

    public void gerarTransito(){
        preencherSentidos();
        preferenciaPadrao();

        System.out.print("Sentido Horizontal: ");
        mostrarVeiculos(sentidoHorizontal);
        System.out.print("\n");

        System.out.print("Sentido Vertical: ");
        mostrarVeiculos(sentidoVertical);

        System.out.print("\n");
        definirPreferencia();
    }

    public void mostrarVeiculos(ArrayList<String> sentido){
        for(String veiculo: sentido){
            System.out.print(veiculo + " | ");
        }
    }

    public ArrayList<String> getSentidoVertical() {return sentidoVertical;}
    public void setSentidoVertical(ArrayList<String> sentidoVertical) {this.sentidoVertical = sentidoVertical;}
    public ArrayList<String> getSentidoHorizontal() {return sentidoHorizontal;}
    public void setSentidoHorizontal(ArrayList<String> sentidoHorizontal) {this.sentidoHorizontal = sentidoHorizontal;}
    public Semaforo getSemaforo() {return semaforo;}
    public void setSemaforo(Semaforo semaforo) {this.semaforo = semaforo;}
}
