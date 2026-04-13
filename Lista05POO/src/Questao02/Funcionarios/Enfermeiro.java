package Questao02.Funcionarios;

public class Enfermeiro extends Funcionario {
    private int horasExtrasTrabalhadas;

    public Enfermeiro(String nome, String turno, int horasExtrasTrabalhadas){
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
        double salario = 2000 + 50 * horasExtrasTrabalhadas;
        super(nome, salario, turno);
    }

    @Override
    public String toString(){
        return "Enfermeiro";
    }

    public int getHorasExtrasTrabalhadas() {return horasExtrasTrabalhadas;}
    public void setHorasExtrasTrabalhadas(int horasExtrasTrabalhadas) {this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;}
}
