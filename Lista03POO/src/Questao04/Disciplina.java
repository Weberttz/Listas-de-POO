package Questao04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Disciplina {
    private int codigo;
    private String nome;
    private int quantidadeMaxima;
    private final ArrayList<Aluno> alunosMatriculados;

    public Disciplina(String nome, int codigo, int quantidadeMaxima){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeMaxima = quantidadeMaxima;
        alunosMatriculados = new ArrayList<>();
    }

    public Aluno procurarAluno(int matricula){
        for(Aluno aluno: alunosMatriculados){
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }

    public boolean matricularAluno(String nome, int matricula){
        if(alunosMatriculados.size() >= quantidadeMaxima)
            return false;

        for(Aluno alunoAux: alunosMatriculados){
            if(alunoAux.getMatricula() == matricula)
                return false;
        }

        Aluno aluno = new Aluno(nome, matricula);
        alunosMatriculados.add(aluno);
        return true;
    }

    public boolean atribuirNotas(int matricula, double nota1, double nota2){
        Aluno aluno = procurarAluno(matricula);

        if(aluno == null)
            return false;

        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        return true;
    }

    public boolean alterarNotas(int matricula, double nota1, double nota2){
        return atribuirNotas(matricula, nota1, nota2);
    }

    public void gerarEstatisitcas(){

        if(alunosMatriculados.isEmpty()) {
            System.out.println("Não exitem alunos cadastrados na disciplina");
            return;
        }

        double maior = 0, mediaGeral = 0;
        int matricula = 0, quantidadeAlunos = alunosMatriculados.size();
        int quantidadeAprovados = 0, quantidadeReprovados;
        for(Aluno aluno : alunosMatriculados){
            if(aluno.calcularMedia() > maior) {
                maior = aluno.calcularMedia();
                matricula = aluno.getMatricula();
            }
            mediaGeral+= aluno.calcularMedia();
        }

        mediaGeral/= quantidadeAlunos;

        Aluno alunoComMaiorNota = procurarAluno(matricula);
        if(alunoComMaiorNota != null) {
            System.out.println("O aluno com maior nota: ");
            alunoComMaiorNota.mostrarDados();
        }

        for(Aluno aluno : alunosMatriculados){
            if(aluno.calcularMedia() >= 7) {
                quantidadeAprovados++;
            }
        }

        System.out.println("Quantidade de alunos que foram aprovados: " + quantidadeAprovados);
        quantidadeReprovados = alunosMatriculados.size() - quantidadeAprovados;
        System.out.println("Quantidade de alunos reprovados: " + quantidadeReprovados);
        System.out.println("A média geral da turma: " + mediaGeral);
        listarEmOrdemAlfabetica();
    }

    public void listarEmOrdemAlfabetica() {
        if(alunosMatriculados.isEmpty()) {
            System.out.println("Não exitem alunos cadastrados na disciplina");
            return;
        }
        System.out.println("Lista em ordem alfabética: ");
        Collections.sort(alunosMatriculados, (p1, p2) -> CharSequence.compare(p1.getNome(), p2.getNome()));
        for (Aluno aluno: alunosMatriculados){
            aluno.mostrarDados();
        }
    }

    public void listarEmOrdemMedias(){
        if(alunosMatriculados.isEmpty()) {
            System.out.println("Não exitem alunos cadastrados na disciplina");
            return;
        }
        System.out.println("Lista em ordem de médias: ");
        Collections.sort(alunosMatriculados, Comparator.comparingDouble(Aluno::calcularMedia));
        for(int i=alunosMatriculados.size()-1; i>=0; i--){
            alunosMatriculados.get(i).mostrarDados();
        }
    }

    public String getNome(){return nome;}
    public int getCodigo(){return codigo;};
}
