package Questao04;

public class Palavra {
    private String palavra;

    public Palavra(String palavra){
        this.palavra = palavra;
    }

    public String inverterPalavra(){
        String palavraInvertida = "";
        for(int i = palavra.length() - 1; i>=0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        return palavraInvertida;
    }

    public void concatenarPalavra(String novaPalavra){
        palavra += novaPalavra;
    }

    public boolean verificarPalavra(String palavra){
        return this.palavra.equals(palavra);
    }

    public int quantVogais(){
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        int qntVogais = 0;
        for(char letra: palavra.toLowerCase().toCharArray()){
            for(char vogal: vogais){
                if(letra == vogal)
                    qntVogais++;
            }
        }

        return qntVogais;
    }

    public String getPalavra(){return palavra;}
}
