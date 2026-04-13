package Questao02.Funcionarios.Medicos;

public class MedicoFormado extends Medico {
    private String especializacao;
    public MedicoFormado(String nome, String turno, String especializacao) {
        double salario = 5000;
        if(especializacao.equalsIgnoreCase("Pediatra"))
            salario+=1000;
        else
            salario+=1500;

        super(nome, salario, turno);
    }

    @Override
    public String toString(){
        return "Médico Formado";
    }

    public String getEspecializacao() {return especializacao;}
    public void setEspecializacao(String especializacao) {this.especializacao = especializacao;}
}
