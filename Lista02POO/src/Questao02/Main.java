package Questao02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String nome;
        int opcao = 0;
        boolean fim = false;

        Loja loja = new Loja("Chiquinho lanches");
        loja.adicionarItemDeVenda(new Produto("Arroz", "alimento", 5.99));
        loja.adicionarItemDeVenda(new Produto("Feijão", "alimento", 6.99));
        loja.adicionarItemDeVenda(new Produto("Macarrão", "alimento", 6.99));
        loja.adicionarItemDeVenda(new Produto("Manteiga", "alimento", 7.5));

        while(!fim) {
            do {
                loja.mostrarItensDeVenda();
                System.out.print("Menu\n1 - Realizar Compras\n0 - Sair\nOpção: ");
                opcao = teclado.nextInt();

            } while (opcao != 0 && opcao != 1);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto que deseja comprar: ");
                    nome = teclado.next();
                    teclado.nextLine();
                    Produto produto = loja.procurarProduto(nome);
                    if(produto == null)
                        System.out.println("Produto não encontrado");
                    else
                        System.out.println("Valor do produto: " + loja.vender(produto));
                    break;
                case 0:
                    fim = true;
                    break;
            }
        }

        if(loja.getTamanhoCarrinho() != 0)
            loja.gerarNotaFiscal();
        else
            System.out.println("Nenhum produto foi comprado");

        teclado.close();
    }
}
