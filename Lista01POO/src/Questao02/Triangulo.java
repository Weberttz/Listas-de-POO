package Questao02;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double ladoA, ladoB, ladoC;
        do{
            System.out.print("Digite o tamanho do lado A: ");
            ladoA = teclado.nextDouble();
        }while(ladoA <= 0);

        do{
            System.out.print("Digite o tamanho do lado B: ");
            ladoB = teclado.nextDouble();
        }while(ladoB <= 0);

        do{
            System.out.print("Digite o tamanho do lado C: ");
            ladoC = teclado.nextDouble();
        }while(ladoC <= 0);

        if(ladoB + ladoC < ladoA || ladoA + ladoC < ladoB || ladoA + ladoB < ladoC) {
            System.out.println("A medida desses três lados não formam um triângulo, pois não estabelecem a desigualdade triangular.");
            System.exit(0);
        }

        if(ladoA == ladoB && ladoA == ladoC)
            System.out.print("O triangulo é equilátero");
        else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
            System.out.println("O triangulo é isósceles.");
        else
            System.out.print("O triangulo é escaleno.");
    }
}