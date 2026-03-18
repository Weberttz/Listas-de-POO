package Questao01;

import java.util.Scanner;

public class Compras{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de maças compradas: ");
        int quantidade = teclado.nextInt();
        float total = 0;

        if(quantidade < 12)
            total+= 1.3f * quantidade;
        else
            total+= 1.0f * quantidade;

        System.out.println("O custo total na compra de " + quantidade + " maças é: " + total);

    }
}