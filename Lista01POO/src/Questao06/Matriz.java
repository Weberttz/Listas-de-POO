package Questao06;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Matriz{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int somaElementos = 0, tracoMatriz = 0;
        int tamanho = 0;
        
        do {
            System.out.print("Digite a ordem da matriz: ");
            tamanho = teclado.nextInt();
        }while(tamanho <= 0);

        int[][] matriz = new int[tamanho][tamanho];

        for(int i=0; i<tamanho; i++){
            for(int j=0; j<tamanho; j++){
                System.out.printf("Digite o elemento da posição [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();

                somaElementos+= matriz[i][j];
            }
            tracoMatriz += matriz[i][i];
        }

        boolean ehDiagonal = true;

        for(int i=0; i<tamanho; i++){
            for(int j=0; j<tamanho; j++){
                if(i != j && matriz[i][j] != 0){
                    ehDiagonal = false;
                    break;
                }
                if(!ehDiagonal)
                    break;
            }
        }

        int maiorElemento = matriz[0][0], menorElemento = matriz[0][0];

        for(int i=0; i<tamanho; i++){
            for(int j=0; j<tamanho; j++) {
                if(matriz[i][j]  > maiorElemento)
                    maiorElemento = matriz[i][j];

                if(matriz[i][j] < menorElemento)
                    menorElemento = matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + somaElementos);
        System.out.println("O traço da matriz é: " + tracoMatriz);
        if(ehDiagonal)
            System.out.println("A matriz é diagonal.");
        else
            System.out.println("A matriz não é diagonal.");
        System.out.println("O maior elemento da matriz é: " + maiorElemento);
        System.out.println("O menor elemento da matriz é: " + menorElemento);
    }
}