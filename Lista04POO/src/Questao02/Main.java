package Questao02;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Quarto quarto1 = new Quarto(1);
    static Quarto quarto2 = new Quarto(2);
    static Hotel hotel = new Hotel(100, true, 0);

    public static void ocuparQuarto(){
        int quantidadeDias;
        System.out.println("Digite a quantidade de dias de estadia: ");
        quantidadeDias = scanner.nextInt();

        int numero = hotel.ocuparQuarto(quantidadeDias);

        if(numero == 0)
            System.out.println("Não foi possível ocupar nenhum quarto, todos estão ocupados");
        else
            System.out.println("Quarto " + numero + " ocupado com sucesso!");
    }

    public static void desocuparQuarto(){
        int numeroQuarto;
        System.out.print("Digite o número do quarto que deseja desocupar: ");
        numeroQuarto = scanner.nextInt();

        if(hotel.desocuparQuarto(numeroQuarto))
            System.out.println("Quarto desocupado com sucesso.");
        else
            System.out.println("Não foi possível desocupar esse quarto.");
    }

    public static void calcularTotal(){
        int numeroQuarto;
        System.out.print("Digite o número do quarto que deseja desocupar: ");
        numeroQuarto = scanner.nextInt();

        System.out.println(hotel.calcularTotalAPagar(numeroQuarto));
    }

    public static void gerarCupomFiscal(){
        int numeroQuarto;
        String formaDePagamento;
        double notaAvaliacao;
        System.out.print("Digite o número do quarto: ");
        numeroQuarto = scanner.nextInt();
        System.out.print("Digite a forma de pagamento: ");
        formaDePagamento = scanner.next();
        System.out.print("Digite o nota de avaliação: ");
        notaAvaliacao = scanner.nextDouble();

        hotel.gerarCupomFiscal(numeroQuarto, formaDePagamento, notaAvaliacao);
    }

    public static void listarQuartos()
    {
        hotel.mostrarListaDeDados();
    }

    public static void mostrarMenu(){
        System.out.println("1. Ocupar quarto");
        System.out.println("2. Desocupar quarto");
        System.out.println("3. Calcular total");
        System.out.println("4. Gerar cupom fiscal");
        System.out.println("5. Mostrar lista de quartos");
        System.out.println("0. Sair do sistema");
    }

    public static void main(String[] args){
        hotel.adicionarQuartos(quarto1);
        hotel.adicionarQuartos(quarto2);

        boolean fim = false;
        int opcao;
        while (!fim) {
            mostrarMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1: ocuparQuarto();break;
                case 2: desocuparQuarto(); break;
                case 3: calcularTotal(); break;
                case 4: gerarCupomFiscal(); break;
                case 5: listarQuartos(); break;
                case 0: fim = true; break;
                default: System.out.println("Opção inválida");
            }
        }
    }
}
