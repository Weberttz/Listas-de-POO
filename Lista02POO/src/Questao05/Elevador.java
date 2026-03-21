package Questao05;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int totalAndares){
        this.totalAndares = totalAndares;
        andarAtual = 0;
        capacidade = 5;
        pessoasPresentes = 0;
    }

    public boolean entra(){
        if(podeEntrar()) {
            pessoasPresentes++;
            return true;
        }
        return false;
    }

    public boolean sai(){
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            return true;
        }
        return false;
    }

    public boolean sobe(){
        if(andarAtual < totalAndares) {
            andarAtual++;
            return true;
        }
        return false;
    }

    public boolean sobe(int andar){
        if(andarAtual < totalAndares && andar <= totalAndares) {
            andarAtual = andar;
            return true;
        }
        return false;
    }

    public boolean desce(){
        if(andarAtual  > 0) {
            andarAtual--;
            return true;
        }
        return false;
    }

    public boolean desce(int andar) {
        if(andarAtual > andar && andar >= 0) {
            andarAtual = andar;
            return true;
        }
        return false;
    }
    
    public boolean podeEntrar(){ return pessoasPresentes < capacidade; }
    public int getAndarAtual(){return andarAtual;}
    public int getPessoasPresentes() { return  pessoasPresentes;}

}
