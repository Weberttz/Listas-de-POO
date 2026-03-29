package Questao02;

public class Veiculo {
    private double precoAVista;
    private double precoTotalParcelado;
    private String nome;
    private String tipo;
    private int quantidadeDePortas;

    public Veiculo(String nome, double precoAVista, int quantidadeDePortas){
        if(quantidadeDePortas == 0)
            tipo = "Moto";
        if(quantidadeDePortas == 2)
            tipo = "Caminhão";
        if(quantidadeDePortas == 4)
            tipo = "Carro";

        this.nome = nome;
        this.precoAVista = precoAVista;
        precoTotalParcelado = precoAVista + (0.5 * precoAVista);
    }

    public String mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Quantidade de portas: " + quantidadeDePortas);

        return "Nome: " + nome + "\nTipo: " + tipo + "\nQuantidade de portas: " +  quantidadeDePortas;
    }

    public String getNome(){ return nome;}
    public double getPrecoAVista(){return precoAVista;}
    public double getPrecoTotalParcelado(){ return precoTotalParcelado;}
}
