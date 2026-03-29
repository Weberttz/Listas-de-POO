package Questao04;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula){
        this.nome =  nome;
        this.matricula = matricula;
        nota1 = 0;
        nota2 = 0;
    }

    public double calcularMedia(){
        return (nota1 + nota2)/ 2;
    }

    public void mostrarDados(){
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Média: " + calcularMedia());
        System.out.println("-------------------");
    }

    public String getNome(){ return nome;}
    public int getMatricula(){ return matricula;}
    public void setNota1(double nota1){this.nota1 = nota1;}
    public void setNota2(double nota2){this.nota2 = nota2;}
}
