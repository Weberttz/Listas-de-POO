package Questao02;

import Questao02.Funcionarios.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<Funcionario> funcionarios = new ArrayList<>(){{
            add(new MedicoFormado("Maria", "Manhã", "Pediatra"));
            add(new MedicoFormado("Mario", "Integral", "Cirurgião"));
            add(new FuncionarioGeral("José"));
            add(new Enfermeiro("Jonas", "Tarde", 100));
            add(new MedicoEstagiario("Isabelly", "Integral"));
            add(new FuncionarioGeral("Naiane"));
            add(new Enfermeiro("Thiciane", "Noite", 100));
            add(new MedicoFormado("Liana", "Noite", "Cirurgião"));
        }};

        MedicoDiretor medicoDiretor = new MedicoDiretor("Jonh", "Manhã", "Cirurgião");
        Hospital hospital = new Hospital(medicoDiretor, funcionarios);

        boolean fim = false;
        int opcao;
        while(!fim){
            System.out.println("1 - Realizar Cirurgia");
            System.out.println("2 - Mostrar Histórico de Cirurgias");
            System.out.println("3 - Mostrar Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opcão: ");
            opcao = scanner.nextInt();
            switch (opcao)
            {
                case 1:
                    String status = (hospital.realizarCirurgia())? "Cirurgia realizada com sucesso!": "Não foi possível realizar a cirurgia. Sem cirurgião";
                    System.out.println(status);
                    break;
                case 2: hospital.gerarFolhaDePagamento();break;
                case 3: hospital.mostrarFuncionarios(); break;
                case 0: fim = true;break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }
}
