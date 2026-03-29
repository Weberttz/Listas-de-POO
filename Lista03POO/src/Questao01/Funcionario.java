package Questao01;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo =  cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        salario = 1509;
    }

    public String getNome(){
        return nome;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
