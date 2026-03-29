package Questao05;

public class Main {

    public static void main(String[] args) {
       Data data1 = new Data(10, 10, 2010);
       Data data2 = new Data(30, 12, 1892);

        System.out.println("Data 1: " + data1.toString());
        System.out.println("Data 2: " + data2.toString());

        if(data1.maisAntiga(data2))
            System.out.println("Data 1 é mais antiga");
        else
            System.out.println("Data 2 é mais antiga");

        data1.avancarDia();
        data2.avancarDia();
        System.out.println("Após avançar um dia em ambas");
        System.out.println("Data 1: " + data1.toString());
        System.out.println("Data 2: " + data2.toString());
    }
}
