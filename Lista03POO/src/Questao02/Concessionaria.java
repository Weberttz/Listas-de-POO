package Questao02;
import java.util.ArrayList;

public class Concessionaria {
    private String nome;
    private ArrayList<Veiculo> carrosAVenda;
    private ArrayList<String> vendas;

    public Concessionaria(String nome){
        this.nome = nome;
        carrosAVenda = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        carrosAVenda.add(veiculo);
    }

    public void mostrarCarrosAVenda(){
        for(Veiculo veiculo: carrosAVenda){
            System.out.println("Nome: " + veiculo.getNome() + " | Preço à vista: " + veiculo.getPrecoAVista()  +
                    " | Preço total parcelado: " + veiculo.getPrecoTotalParcelado());
        }
    }

    public Veiculo procurarVeiculo(String nome){
        for(Veiculo veiculo: carrosAVenda){
            if(veiculo.getNome().equals(nome))
                return veiculo;
        }

        return null;
    }

    public boolean venderVeiculo(String nome, int tipoDePagamento, int quantidadeParcelas){
        double parcela = 0;
        Veiculo veiculo = procurarVeiculo(nome);

        if(veiculo == null)
            return false;

        if(tipoDePagamento == 2)
            parcela = veiculo.getPrecoTotalParcelado() / quantidadeParcelas;

        gerarCupomFiscal(veiculo, tipoDePagamento, parcela);
        return true;
    }

    public void gerarCupomFiscal(Veiculo veiculo, int tipoDePagamento, double parcela){
        String venda = "";

        venda += nome + "\n";
        System.out.println(nome);

        venda += veiculo.mostrarDados();

        if(tipoDePagamento == 1) {
            System.out.println("Método de pagamento: À vista");
            System.out.println("Valor total: " + veiculo.getPrecoAVista());

            venda += "\nMétodo de pagamento: À vista\n" + "Valor total: " + veiculo.getPrecoAVista();
         }
        else {
            System.out.println("Método de pagamento: Parcelado");
            System.out.println("Valor da parcela: " + parcela);
            System.out.println("Valor total: " + veiculo.getPrecoTotalParcelado());

            venda += "\nMétodo de pagamento: Parcelado\n" + "Valor da parcela: " + parcela + "Valor total: "  +
                    veiculo.getPrecoTotalParcelado();
        }

        vendas.add(venda);
    }

    public void gerarExtratoVendas(){
        System.out.println("Extrato de Vendas");
        if(vendas.isEmpty())
            System.out.println("Nenhuma venda registrada");
        for(String venda : vendas){
            System.out.println(venda);
        }
    }
}
