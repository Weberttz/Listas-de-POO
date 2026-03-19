package Questao05;

import java.util.Scanner;

public class Estacionamento{
    public static void main(String[] args){
        int horaEntrada, horaSaida, minutoEntrada, minutoSaida, minutos, horas, valorTotal = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite a hora de entrada: ");
            horaEntrada = teclado.nextInt();
        }while(horaEntrada < 0 || horaEntrada > 23);

        do {
            System.out.print("Digite o minuto de entrada: ");
            minutoEntrada = teclado.nextInt();
        }while(minutoEntrada < 0 || minutoEntrada > 59);

        do {
            System.out.print("Digite a hora de saída: ");
            horaSaida = teclado.nextInt();
        }while(horaSaida < 0 || horaSaida > 23);

        do {
            System.out.print("Digite o minuto de saída: ");
            minutoSaida = teclado.nextInt();
        }while(minutoSaida < 0 || minutoSaida > 59);

        System.out.printf("Tempo inicial: %02d:%02d\n", horaEntrada, minutoEntrada);
        System.out.printf("Tempo final: %02d:%02d\n", horaSaida, minutoSaida);

        if(horaSaida < horaEntrada)
            horaSaida+= 24;

        minutos = (horaSaida * 60 + minutoSaida) - (horaEntrada * 60 + minutoEntrada);

        horas = minutos/60;
        minutos %= 60;

       if(minutos > 0)
           horas++;

       switch (horas){
           case 1:  valorTotal+= 5;
                break;
           case 2: valorTotal+= 8;
                break;
           default: valorTotal+= 8 + (horas-2)*2;
                break;
       }

        System.out.print("O valor total a ser pago no período de estacionamento é: " + valorTotal);

    }
}