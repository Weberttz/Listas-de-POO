package Questao05;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString(){
        return String.format("%02d/%02d/%02d", dia, mes, ano);
    }

    public void avancarDia(){
        if(dia < 30)
            dia++;
        else{
            dia = 1;
            mes++;
        }

        if(mes > 12) {
            mes = 1;
            ano++;
        }
    }

    public boolean maisAntiga(Data data) {
        int dia = data.dia, mes = data.mes, ano = data.ano;
        int diasAux = (this.ano * 365) + (this.mes * 30) + this.dia;
        int diasAux2 = (ano * 365) + (mes * 30) + dia;

        return diasAux < diasAux2;
    }
}
