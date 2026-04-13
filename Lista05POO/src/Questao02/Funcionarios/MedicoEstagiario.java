package Questao02.Funcionarios.Medicos;

public class MedicoEstagiario extends Funcionario {
    public MedicoEstagiario(String nome, String turno){
        super(nome, 1200, turno);
    }

    @Override
    public String toString(){
        return "Médico Estagiário";
    }
}
