package Questao01;

public class Estado {
    private String nome;
    private String sigla;
    private double precoAlcool;
    private double precoGasolina;

    public Estado(String nome, String sigla, double precoAlcool, double precoGasolina){
        this.nome = nome;
        this.sigla = sigla;
        this.precoAlcool = precoAlcool;
        this.precoGasolina = precoGasolina;
    }

    public String verificarVantagem() {
        if(precoAlcool <= 0.7 * precoGasolina)
            return nome + " | " + sigla + " | álcool | ";

        return nome + " | " + sigla + " | gasolina | ";
    }

    public double getPrecoVantajoso(){
        if(precoAlcool <= 0.7 * precoGasolina)
            return precoAlcool;

        return precoGasolina;
    }

    public String getNome(){return nome;}
    public String getSigla(){return sigla;}
    public double getPrecoAlcool(){return precoAlcool;};
    public double getPrecoGasolina(){ return precoGasolina;}
    public void setAlcool(double alcool) { this.precoAlcool = alcool;}
    public void setNome(String nome){this.nome = nome;}
    public void setSigla(String sigla){this.sigla = sigla;}
    public void setGasolina(double gasolina){this.precoGasolina = gasolina;}
}
