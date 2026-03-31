package Questao02;

import java.util.ArrayList;

public class Hotel {
    private double valorDiaria;
    private boolean possuiCafe;
    private double valorCafe;
    private ArrayList<Quarto> quartos;
    private double notaAvaliacao;

    public Hotel(double valorDiaria, boolean possuiCafe, double notaAvaliacao){
        this.valorDiaria = valorDiaria;
        this.possuiCafe = possuiCafe;
        this.valorCafe = 200;
        this.notaAvaliacao = notaAvaliacao;
        quartos = new ArrayList<>();
    }

    public void adicionarQuartos(Quarto quarto){
        quartos.add(quarto);
    }

    public Quarto procurarQuartoVago(){
        for(Quarto quarto: quartos){
            if(quarto.getVago())
                return quarto;
        }
        return null;
    }

    public Quarto procurarQuarto(int numeroQuarto){
        for(Quarto quarto: quartos){
            if(quarto.getNumeroQuarto() == numeroQuarto)
                return quarto;
        }
        return null;
    }

    public int ocuparQuarto(int quantidadeDias){
        Quarto quarto = procurarQuartoVago();

        if(quarto == null)
            return 0;

        quarto.setVago(false);
        quarto.setQuantidadeDeDias(quantidadeDias);
        return quarto.getNumeroQuarto();
    }

    public boolean desocuparQuarto(int numeroQuarto){
        Quarto quarto = procurarQuarto(numeroQuarto);

        if(quarto == null)
            return false;

        quarto.setVago(true);
        quarto.setQuantidadeDeDias(0);
        return true;
    }

    public double calcularHospedagem(int numeroQuarto){
        Quarto quarto = procurarQuarto(numeroQuarto);

        if(quarto == null || quarto.getQuantidadeDeDias() == 0)
            return 0;

        return quarto.getQuantidadeDeDias() * valorDiaria;
    }

    public double cobrarConsumo(int numeroQuarto){
        if(calcularHospedagem(numeroQuarto) == 0)
            return 0;

        if(!possuiCafe)
            return calcularHospedagem(numeroQuarto);

        return calcularHospedagem(numeroQuarto) + valorCafe;
    }

    public double calcularTotalAPagar(int numeroQuarto){
        return cobrarConsumo(numeroQuarto);
    }

    public void gerarCupomFiscal(int numeroQuarto, String tipoDePagamento, double notaAvaliacao){
        Quarto quarto = procurarQuarto(numeroQuarto);

        double total = calcularTotalAPagar(numeroQuarto);
        if(tipoDePagamento.equals("Vista") || tipoDePagamento.equals("vista"))
            total -= 0.1 * total;

        System.out.println("Quarto de número: " + numeroQuarto);
        System.out.println("Dias de estadia: " + quarto.getQuantidadeDeDias());
        System.out.println("Tipo de Pagamento: " + tipoDePagamento);
        System.out.println("Total: " + total);
        deixarAvalicacao(notaAvaliacao);
        quarto.setVago(true);
    }

    public void deixarAvalicacao(double notaHospede){
        if(notaHospede < 0)
            notaHospede = 0;
        if(notaHospede > 5)
            notaHospede = 5;

        notaAvaliacao+= notaHospede/100;
    }

    public void mostrarListaDeDados(){
        for(Quarto quarto: quartos){
            System.out.printf("Quarto " + quarto.getNumeroQuarto());
            if(quarto.getVago())
                System.out.println(" | Vago");
            else
                System.out.println(" | Ocupado " + " | " + quarto.getQuantidadeDeDias());
        }
    }

    public double getValorDiaria() {return valorDiaria;}
    public boolean isPossuiCafe() {return possuiCafe;}
    public double getValorCafe() {return valorCafe;}
    public double getNotaAvaliacao() {return notaAvaliacao;}
    public ArrayList<Quarto> getQuartos() {return quartos;}
    public void setValorDiaria(double valorDiaria) {this.valorDiaria = valorDiaria;}
    public void setPossuiCafe(boolean possuiCafe) {this.possuiCafe = possuiCafe;}
    public void setValorCafe(double valorCafe) {this.valorCafe = valorCafe;}
    public void setQuartos(ArrayList<Quarto> quartos) {this.quartos = quartos;}
    public void setNotaAvaliacao(double notaAvaliacao) {this.notaAvaliacao = notaAvaliacao;}
}
