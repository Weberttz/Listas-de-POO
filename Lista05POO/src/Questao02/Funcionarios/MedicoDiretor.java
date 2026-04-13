package Questao02.Funcionarios.Medicos;

import Questao02.Hospital;

public class MedicoDiretor extends Medico {
    private String especializacao;

    public MedicoDiretor(String nome, String turno, String especializacao) {
        double salario = 10000;
        if(especializacao.equalsIgnoreCase("Pediatra"))
            salario+=1000;
        else
            salario+=1500;

        super(nome, salario, turno);
    }

    public void contratarFuncionario(Funcionario funcionario, Hospital hospital){
        hospital.getFuncionarios().add(funcionario);
    }

    public void demitirFuncionario(Funcionario funcionario, Hospital hospital){
        hospital.getFuncionarios().add(funcionario);
    }

    @Override
    public String toString(){
        return "Médico Diretor";
    }

    public String getEspecializacao() {return especializacao;}
    public void setEspecializacao(String especializacao) {this.especializacao = especializacao;}
}
