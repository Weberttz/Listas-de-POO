package Questao03;

public class Animal {
    private String nome;
    private double peso;
    private int quantidade;
    private double valor;

    public Animal(){
        nome = "Galinha";
        peso = 1.5;
        quantidade = 500;
    }
    public Animal(String nome){
        this.nome = nome;
        peso = 2;
        quantidade = 100;
    }
    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
        quantidade = 50;
    }

    public String gerarRelatorio(){
        valor = 500;

        if(nome.equals("Galinha"))
            valor = 2;
        if(nome.equals("Pato"))
            valor = 50;
        if(nome.equals("Ganso"))
            valor = 100;
        if(nome.equals("Vaca"))
            valor = 1500;
        if(nome.equals("Porco") && peso > 5){
            valor+= 50 * (peso - 5);
        }

        String conteudo = "";

        conteudo+= "Nome: " + nome + "\nQuantidade: " + quantidade + "\nPeso: " + peso  + "\nValor de lote: " + valor * quantidade;

        return conteudo;
    }

}
