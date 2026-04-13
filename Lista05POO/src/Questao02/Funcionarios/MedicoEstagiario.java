package Questao02.Funcionarios;

public class MedicoEstagiario extends Medico {
    public MedicoEstagiario(String nome, String turno){
        super(nome, 1200, turno);
        this.setEspecializacao("nenhuma");
    }

    @Override
    public String toString(){
        return "Médico Estagiário";
    }
}
