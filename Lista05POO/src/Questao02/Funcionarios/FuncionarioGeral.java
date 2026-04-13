package Questao02.Funcionarios;

public class FuncionarioGeral extends Funcionario {
    public FuncionarioGeral(String nome){
        super(nome, 1200, "Integral");
    }

    @Override
    public String toString(){
        return "Funcionário Geral";
    }
}
