package Questao01;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        boolean terminarPrograma = false;
        String nome, data;

        System.out.print("Digite a quantidade de pessoas que deseja adicionar à lista: ");
        int quantidadePessoas = teclado.nextInt();

        Aniversario lista = new Aniversario(quantidadePessoas);

        while(!terminarPrograma)
        {
            do{
                System.out.println("1 - Adicionar Amigo\n2 - Atualizar Amigo\n3 - Remover Amigo\n4 - Mostrar Lista\n0 - Sair");
                System.out.print("Digite a opção: ");
                opcao = teclado.nextInt();
            }while(opcao < 0 || opcao > 5);

            switch (opcao)
            {
                case 1:
                    System.out.print("Digite o nome da pessoa que deseja adicionar: ");
                    nome = teclado.next();
                    System.out.print("Digite a data de aniversário: ");
                    data = teclado.next();
                    if(lista.adicionarAmigo(nome, data)){
                        System.out.println("Amigo adicionado com sucesso");
                    }else{
                        System.out.println("Não foi possível adicionar o amigo, pois a lista está cheia");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome da pessoa que deseja atualizar: ");
                    nome = teclado.next();
                    System.out.print("Digite o novo nome para a atualização: ");
                    String novoNome = teclado.next();
                    System.out.print("Digite a nova data para a atualização: ");
                    String novaData = teclado.next();
                    if(lista.atualizarAmigo(nome, novoNome, novaData)){
                        System.out.println("Dados do amigo atualizados com sucesso");
                    }else{
                        System.out.println("Dados não encontrados, não foi possível fazer a atualização");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome da pessoa que deseja remover: ");
                    nome = teclado.next();
                    if(lista.removerAmigo(nome)){
                        System.out.println("Remoção feita com sucesso");
                    }else{
                        System.out.println("Nome não encontrado, remoção não foi realizada");
                    }
                    break;
                case 4:
                    lista.mostrarLista();
                    break;
                case 0:
                    terminarPrograma = true;
                    break;
            }
        }
    }
}