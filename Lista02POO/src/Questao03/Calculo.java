package Questao03;

public class Calculo {
    private double x, y;

    public void calcular(){
        double soma, subtracao, multiplicacao, resto;

        soma = x + y;
        subtracao = x - y;
        multiplicacao = x * y;
        resto = x%y;

        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Subtração = %.2f\n", subtracao);
        System.out.printf("Multiplicação = %.2f\n", multiplicacao);
        System.out.printf("Resto de divisão = %.2f\n", resto);

        if(resto == 0)
            System.out.println("y divide x");
        else
            System.out.println("y não divide x");
    }

    public void gerarRaiz(){
        double raizX, raizY;

        raizX = Math.sqrt(x);
        raizY = Math.sqrt(y);

        System.out.printf("Raiz de x = %.2f\n", raizX);
        System.out.printf("Raiz de y = %.2f\n", raizY);
    }

    public void gerarPotencia(){
        double potencia = Math.pow(x, y);
        System.out.printf("Potência de x elevado à y = %.2f\n", potencia);
    }

    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
}
