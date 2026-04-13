package Questao02.Funcionarios;

public abstract class Medico extends Funcionario {
    private String especializacao;
    public Medico(String nome, double salario, String turno) {
       super(nome, salario, turno);
    }

    public String getEspecializacao() {return especializacao;}
    public void setEspecializacao(String especializacao) {this.especializacao = especializacao;}
}
