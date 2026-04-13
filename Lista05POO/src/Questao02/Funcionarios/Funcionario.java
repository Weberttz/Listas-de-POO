package Questao02.Funcionarios.Medicos;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private String turno;

    public Funcionario(String nome, double salario, String turno){
        this.nome = nome;
        this.salario = salario;
        this.turno = turno;
    }

    public double exibirSalario(){return this.salario;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
    public String getTurno() {return turno;}
    public void setTurno(String turno) {this.turno = turno;}
}
