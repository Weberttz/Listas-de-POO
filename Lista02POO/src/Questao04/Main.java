package Questao04;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner teclado = new Scanner(System.in);
        Palavra palavra;
        boolean fim = false;
        int opcao;
        while(!fim){
            do {
                System.out.print("Digite a palavra: ");
                palavra = new Palavra(teclado.next());
                System.out.print("Menu:\n1. Inverter\n2. Contar vogais\n3. Concatenar\n4. Verificar\n0. Sair\nOpção: ");
                opcao = teclado.nextInt();
            }while(opcao < 0 || opcao > 4);

            switch (opcao){
                case 1:
                    System.out.println(palavra.inverterPalavra());
                    break;
                case 2:
                    System.out.println(palavra.quantVogais());
                    break;
                case 3:
                    System.out.print("Digite a nova palavra para fazer a concatenação: ");
                    String novaPalavra = teclado.next();
                    palavra.concatenarPalavra(novaPalavra);
                    System.out.println(palavra.getPalavra());
                    break;
                case 4:
                    System.out.print("Digite a nova palavra para fazer a verificação: ");
                    String palavraTeste = teclado.next();
                    if(!palavra.verificarPalavra(palavraTeste))
                        System.out.println("Palavras difeentes");
                    else
                        System.out.println("Palavras iguais");
                    break;
                case 0:
                    fim = true;
                    break;
            }
        }
        teclado.close();
    }
}
