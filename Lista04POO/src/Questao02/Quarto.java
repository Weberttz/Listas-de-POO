package Questao02;

public class Quarto {
    private int numeroQuarto;
    private int quantidadeDeDias;
    private boolean vago;
    
    public Quarto(int numeroQuarto){
        this.numeroQuarto = numeroQuarto;
        quantidadeDeDias = 0;
        vago = true;
    }

    public Quarto(int numeroQuarto, int quantidadeDeDias, boolean vago){
        this.numeroQuarto = numeroQuarto;
        this.quantidadeDeDias = quantidadeDeDias;
        this.vago = vago;
    }

    public int getNumeroQuarto(){return numeroQuarto;}
    public boolean getVago(){ return vago;}
    public int getQuantidadeDeDias(){ return quantidadeDeDias;}
    public void setNumeroQuarto(int numeroQuarto){ this.numeroQuarto = numeroQuarto;}
    public void setVago(boolean vago) {this.vago = vago;}
    public void setQuantidadeDeDias(int quantidadeDeDias) { this.quantidadeDeDias = quantidadeDeDias;}
}
