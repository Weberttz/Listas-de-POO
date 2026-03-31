package Questao05;

import java.util.ArrayList;

public class Amigo {
    private String nome;
    private int idade;
    private String dataDeNascimento;
    private ArrayList<String> presentesDados;

    public Amigo(String nome, String dataDeNascimento){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        presentesDados = new ArrayList<>();
        idade = calcularIdade();
    }

    public int calcularIdade(){
        char data[] = dataDeNascimento.toCharArray();
        int anoNascimento = (data[6] - '0') * 1000 + (data[7] - '0') * 100 + (data[8] - '0') * 10 + (data[9] - '0');

        return 2026 - anoNascimento;
    }

    public void acionarPresente(String presente){
        presentesDados.add(presente);
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento " + dataDeNascimento);
        for(String string : presentesDados)
            System.out.print(presentesDados + " ");
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public String getDataDeNascimento() {return dataDeNascimento;}
    public int getDiaNascimento(){
        char data[] = dataDeNascimento.toCharArray();
        return ((data[0] - '0') * 10) + (data[1] - '0');
    }
    public void setDataDeNascimento(String dataDeNascimento) {this.dataDeNascimento = dataDeNascimento;}
    public ArrayList<String> getPresentesDados() {return presentesDados;}
    public void setPresentesDados(ArrayList<String> presentesDados) {this.presentesDados = presentesDados;}
}
