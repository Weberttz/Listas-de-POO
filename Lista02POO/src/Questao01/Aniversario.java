package Questao01;

public class Aniversario {
    int quantidadePessoas, k = 0;
    String pessoas[];
    String datas[];

    public Aniversario(int quantidadePessoas){
        this.quantidadePessoas = quantidadePessoas;
        pessoas = new String[quantidadePessoas];
        datas = new String[quantidadePessoas];
    }

    public boolean adicionarAmigo(String pessoa, String data){
        if(k < quantidadePessoas) {
            pessoas[k] = pessoa;
            this.datas[k] = data;
            k++;

            return true;
        }

        return false;
    }

    public boolean atualizarAmigo(String pessoa, String novaPessoa, String data){
        for(int i=0; i<k; i++){
            if(pessoas[i].equals(pessoa)){
                pessoas[i] = novaPessoa;
                datas[i] = data;

                return true;
            }
        }
        return false;
    }

    public boolean removerAmigo(String pessoa){

        if(k < 1)
            return false;

        int max = quantidadePessoas - 1;
        boolean encontrado = false;
        for(int i=0; i<max; i++){
            if(pessoas[i].equals(pessoa)) {
                String temp = pessoas[i];
                pessoas[i] = pessoas[i + 1];
                pessoas[i + 1] = temp;

                String aux = datas[i];
                datas[i] = datas[i + 1];
                datas[i + 1] = temp;

                encontrado = true;
            }
        }
        if(encontrado) {
            k--;
            return true;
        }
        return false;
    }

    public void mostrarLista(){
        System.out.println("Lista");
        for(int i =0; i<k; i++)
            System.out.println(pessoas[i] + " " + datas[i]);
    }
}
