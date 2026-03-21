package Questao03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double x, y;
        int opcao;
        boolean fim = false;
        Calculo objCalculo = new Calculo();

        while (!fim) {
            do {
                System.out.print("Digite o valor de x: ");
                x = teclado.nextDouble();
                System.out.print("Digite o valor de y: ");
                y = teclado.nextDouble();

                objCalculo.setX(x);
                objCalculo.setY(y);

                System.out.print("Menu\n1 - Realizar método calcular\n2 - Realizar método gerarRaiz\n3 - Realizar método gerarPotencia" +
                        "\n0 - Sair\nOpção: ");
                opcao = teclado.nextInt();

            } while (opcao < 0 || opcao > 3);

            switch (opcao) {
                case 1:
                    objCalculo.calcular();
                    break;
                case 2:
                    objCalculo.gerarRaiz();
                    break;
                case 3:
                    objCalculo.gerarPotencia();
                    break;
                case 0:
                    fim = true;
                    break;
            }
        }

        teclado.close();
    }
}
