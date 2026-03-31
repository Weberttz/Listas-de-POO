package Questao04.enums;

public enum Veiculos {
    CARRO(0, "Carro"),
    MOTO(1, "Moto"),
    CAMINHAO(2, "Caminhão"),
    CONVERSIVEL(3, "Carro conversível"),
    CAMINHONETE(4, "Caminhonete"),
    POLICIA(5, "Polícia"),
    BOMBEIRO(6, "Bombeiro"),
    AMBULANCIA(7, "Ambulância");

    private final int numero;
    private final String nome;

    Veiculos(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
}
