package Questao01;
import javax.xml.transform.Source;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome){
        this.nome = nome;
        funcionarios = new ArrayList<>();
    }

    public void registrarNovoFuncionario(String nome, String cargo){
        Funcionario funcionario = new Funcionario(nome, cargo);
        funcionarios.add(funcionario);
    }

    public Funcionario procurarFuncionario(String nome)
    {
        for (Funcionario funcionario: funcionarios){
            if(funcionario.getNome().equals(nome)){
                return funcionario;
            }
        }
        return null;
    }
    public double darAumento(String nome, double valor) {
        Funcionario funcionario = procurarFuncionario(nome);

        if(funcionario == null) return -1;

        double salario = funcionario.getSalario();
        funcionario.setSalario(salario + valor);
        return funcionario.getSalario();
    }

    public boolean demitirFuncionario(String nome){
        Funcionario funcionario = procurarFuncionario(nome);
        return funcionarios.remove(funcionario);
    }

    public boolean promoverFuncionario(String nome, String cargo, double salario){
        Funcionario funcionario = procurarFuncionario(nome);

        if(funcionario == null) return false;

        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);

        return true;
    }

    public void registrarFuncionarioTransferido(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        for(Funcionario funcionario : funcionarios){
            System.out.println("------------------------------");
            System.out.println("Nome: "  + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("------------------------------");
        }
    }

    public String getNome() { return nome; }

}
