package Questao02;

import Questao02.Funcionarios.Funcionario;
import Questao02.Funcionarios.Medico;
import Questao02.Funcionarios.MedicoDiretor;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<String> cirurgias;
    private MedicoDiretor medicoDiretor;
    private ArrayList<Funcionario> funcionarios;

    public Hospital(MedicoDiretor medicoDiretor, ArrayList<Funcionario> funcionarios){
        this.medicoDiretor =medicoDiretor;
        this.funcionarios = funcionarios;
        this.cirurgias = new ArrayList<>();
    }

    public boolean realizarCirurgia(){
        double salarioCirurgiao = 6500;
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getSalario() == salarioCirurgiao && funcionario instanceof Medico) {
                cirurgias.add("Cirurgia " + (cirurgias.size()  + 1) + " realizada por " + funcionario.getNome());
                funcionarios.remove(funcionario);
                funcionarios.add(funcionario);
                return true;
            }
        }
        return false;
    }

    public void gerarFolhaDePagamento(){
        for(String cirurgia: cirurgias){
            System.out.println(cirurgia);
        }
    }

    public void mostrarFuncionarios(){
        for(Funcionario funcionario: funcionarios){
            System.out.println("Nome: " + funcionario.getNome() + " | Salário: " + funcionario.exibirSalario() + " | Cargo: "  + funcionario);
        }
    }

    public ArrayList<String> getCirurgias() {return cirurgias;}
    public void setCirurgias(ArrayList<String> cirurgias) {this.cirurgias = cirurgias;}
    public MedicoDiretor getMedicoDiretor() {return medicoDiretor;}
    public void setMedicoDiretor(MedicoDiretor medicoDiretor) {this.medicoDiretor = medicoDiretor;}
    public ArrayList<Funcionario> getFuncionarios() {return funcionarios;}
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {this.funcionarios = funcionarios;}
}
