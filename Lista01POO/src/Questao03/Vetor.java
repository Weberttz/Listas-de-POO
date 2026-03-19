package Questao03;

import java.util.Scanner;

public class Vetor{
    public static void main(String[] args){
        int tamanho = 10, vetor[] = new int[tamanho];
        Scanner teclado = new Scanner(System.in);

        for(int i=0; i<tamanho; i++){
            System.out.printf("Digite o elemento da posição %d: ", i);
            vetor[i] = teclado.nextInt();
        }

        System.out.print("Vetor na ordem inversa: ");
        for(int i=tamanho -1; i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n");

        //Ordenação do Vetor por Selection Sort
        int min, aux;
        for(int i=0; i<tamanho - 1; i++){
            min = i;
            for(int j=i+1; j<tamanho; j++){
                if(vetor[j] < vetor[min])
                    min = j;
            }

            if(min != i){
                aux = vetor[min];
                vetor[min] = vetor[i];
                vetor[i] = aux;
            }
        }

        System.out.print("Vetor ordenado: ");
        for(int i=0; i<tamanho; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n");

        //Verificação se existe repetição
        boolean existeRepeticao = false;
        for(int i=0; i<tamanho-1; i++) {
            if (vetor[i] == vetor[i + 1]){
                existeRepeticao = true;
                break;
            }
        }

        int qntNegativos = 0, somaElementos = 0;

        if(existeRepeticao) {
            System.out.print("Existe repetição, o(s) elemento(s) que aparecem mais de uma vez são: ");
            for(int i = 1; i < tamanho; i++) {
                if(vetor[i] == vetor[i - 1]) {
                    if(i == 1 || vetor[i] != vetor[i - 2]) {
                        System.out.print(vetor[i] + " ");
                    }
                }
            }
        }
        //Contar menores que zero e somar todos os elementos
        for(int i=0; i<tamanho; i++){
            if(vetor[i] < 0)
                qntNegativos++;
            somaElementos+= vetor[i];
        }

        System.out.println("\nA soma dos elementos é: " + somaElementos);
        System.out.printf("Existem %d elementos menores que zero", qntNegativos);
    }
}